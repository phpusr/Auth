package auth

import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class PublicController {

    def index() { render 'public' }
}
