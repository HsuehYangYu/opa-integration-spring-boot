package aquilacloud.security.opamvc.proxy.rest;

import aquilacloud.security.opamvc.security.opa.OPADataRequest;
import aquilacloud.security.opamvc.security.opa.OPADataResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "opaAuthorization", url = "${app.opa.authz.url}")
public interface OpaClient {
    
    @PostMapping("/aquilacloud/auth/access")
    OPADataResponse authorizedToAccessAPI(@RequestBody OPADataRequest opaDataRequest);
}
