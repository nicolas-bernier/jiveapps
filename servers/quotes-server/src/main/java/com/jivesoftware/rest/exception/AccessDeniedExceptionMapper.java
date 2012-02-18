/**
  Copyright 2012 Jive Software

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
package com.jivesoftware.rest.exception;

import org.springframework.security.access.AccessDeniedException;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class AccessDeniedExceptionMapper implements ExceptionMapper<AccessDeniedException> {

    @Override
    @Produces("application/json")
    public Response toResponse(AccessDeniedException e) {
        String entity = "{ \"code\" : 403, \"message\" : \"" + e.getMessage() + "\" }";
        return Response.status(403).entity(entity).build();
    }

}
