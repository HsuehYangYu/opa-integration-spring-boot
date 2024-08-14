package aquilacloud.auth.access

import future.keywords
import future.keywords.every

default allow := false

#Allow access to the GET /v1/users API endpoint.
#Only if the user has the role (READ), or (ALL)
allow if {
    input.method == "GET"
    input.path = ["v1", "users"]
    allowed_roles := ["read", "all"]
    roles := {role | some role in input.user.authorities; role.authority = allowed_roles[_]}
    count(roles) > 0
}

#Allow access to the POST /v1/users API endpoint
#Only allow if user has the role (ALL)
allow if {
    input.method == "POST"
    input.path = ["v1", "users"]
    roles := {role | some role in input.user.authorities; role.authority = "all"}
    count(roles) == 1
}

#Allow access to the PUT /v1/users API endpoint
#Only allow if user has the role (WRITE) or (ALL) 
#A user should only be able to UPDATE its only data, otherwise DENY.
 
allow if {
    input.method == "PUT"
    input.path = ["v1", "users"]
    allowed_roles := ["write", "all"]
    roles := {role | some role in input.user.authorities; role.authority = allowed_roles[_]}
    upper(input.payload.firstname) = upper(input.user.username)
    count(roles) > 0
}