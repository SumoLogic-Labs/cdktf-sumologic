package com.sumologic.saml_configuration;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.182Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.samlConfiguration.SamlConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(SamlConfigurationConfig.Jsii$Proxy.class)
public interface SamlConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#configuration_name SamlConfiguration#configuration_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getConfigurationName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#issuer SamlConfiguration#issuer}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIssuer();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert1 SamlConfiguration#x509cert1}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getX509Cert1();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#authn_request_url SamlConfiguration#authn_request_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAuthnRequestUrl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDebugMode() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDisableRequestedAuthnContext() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#email_attribute SamlConfiguration#email_attribute}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEmailAttribute() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#id SamlConfiguration#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsRedirectBinding() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLogoutEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_url SamlConfiguration#logout_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLogoutUrl() {
        return null;
    }

    /**
     * on_demand_provisioning_enabled block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#on_demand_provisioning_enabled SamlConfiguration#on_demand_provisioning_enabled}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled getOnDemandProvisioningEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#roles_attribute SamlConfiguration#roles_attribute}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRolesAttribute() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSignAuthnRequest() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSpInitiatedLoginEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_path SamlConfiguration#sp_initiated_login_path}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpInitiatedLoginPath() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert2 SamlConfiguration#x509cert2}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getX509Cert2() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert3 SamlConfiguration#x509cert3}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getX509Cert3() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SamlConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SamlConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SamlConfigurationConfig> {
        java.lang.String configurationName;
        java.lang.String issuer;
        java.lang.String x509Cert1;
        java.lang.String authnRequestUrl;
        java.lang.Object debugMode;
        java.lang.Object disableRequestedAuthnContext;
        java.lang.String emailAttribute;
        java.lang.String id;
        java.lang.Object isRedirectBinding;
        java.lang.Object logoutEnabled;
        java.lang.String logoutUrl;
        com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled onDemandProvisioningEnabled;
        java.lang.String rolesAttribute;
        java.lang.Object signAuthnRequest;
        java.lang.Object spInitiatedLoginEnabled;
        java.lang.String spInitiatedLoginPath;
        java.lang.String x509Cert2;
        java.lang.String x509Cert3;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link SamlConfigurationConfig#getConfigurationName}
         * @param configurationName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#configuration_name SamlConfiguration#configuration_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder configurationName(java.lang.String configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getIssuer}
         * @param issuer Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#issuer SamlConfiguration#issuer}. This parameter is required.
         * @return {@code this}
         */
        public Builder issuer(java.lang.String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getX509Cert1}
         * @param x509Cert1 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert1 SamlConfiguration#x509cert1}. This parameter is required.
         * @return {@code this}
         */
        public Builder x509Cert1(java.lang.String x509Cert1) {
            this.x509Cert1 = x509Cert1;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getAuthnRequestUrl}
         * @param authnRequestUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#authn_request_url SamlConfiguration#authn_request_url}.
         * @return {@code this}
         */
        public Builder authnRequestUrl(java.lang.String authnRequestUrl) {
            this.authnRequestUrl = authnRequestUrl;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getDebugMode}
         * @param debugMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}.
         * @return {@code this}
         */
        public Builder debugMode(java.lang.Boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getDebugMode}
         * @param debugMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}.
         * @return {@code this}
         */
        public Builder debugMode(com.hashicorp.cdktf.IResolvable debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getDisableRequestedAuthnContext}
         * @param disableRequestedAuthnContext Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}.
         * @return {@code this}
         */
        public Builder disableRequestedAuthnContext(java.lang.Boolean disableRequestedAuthnContext) {
            this.disableRequestedAuthnContext = disableRequestedAuthnContext;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getDisableRequestedAuthnContext}
         * @param disableRequestedAuthnContext Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}.
         * @return {@code this}
         */
        public Builder disableRequestedAuthnContext(com.hashicorp.cdktf.IResolvable disableRequestedAuthnContext) {
            this.disableRequestedAuthnContext = disableRequestedAuthnContext;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getEmailAttribute}
         * @param emailAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#email_attribute SamlConfiguration#email_attribute}.
         * @return {@code this}
         */
        public Builder emailAttribute(java.lang.String emailAttribute) {
            this.emailAttribute = emailAttribute;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#id SamlConfiguration#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getIsRedirectBinding}
         * @param isRedirectBinding Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}.
         * @return {@code this}
         */
        public Builder isRedirectBinding(java.lang.Boolean isRedirectBinding) {
            this.isRedirectBinding = isRedirectBinding;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getIsRedirectBinding}
         * @param isRedirectBinding Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}.
         * @return {@code this}
         */
        public Builder isRedirectBinding(com.hashicorp.cdktf.IResolvable isRedirectBinding) {
            this.isRedirectBinding = isRedirectBinding;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getLogoutEnabled}
         * @param logoutEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}.
         * @return {@code this}
         */
        public Builder logoutEnabled(java.lang.Boolean logoutEnabled) {
            this.logoutEnabled = logoutEnabled;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getLogoutEnabled}
         * @param logoutEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}.
         * @return {@code this}
         */
        public Builder logoutEnabled(com.hashicorp.cdktf.IResolvable logoutEnabled) {
            this.logoutEnabled = logoutEnabled;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getLogoutUrl}
         * @param logoutUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_url SamlConfiguration#logout_url}.
         * @return {@code this}
         */
        public Builder logoutUrl(java.lang.String logoutUrl) {
            this.logoutUrl = logoutUrl;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getOnDemandProvisioningEnabled}
         * @param onDemandProvisioningEnabled on_demand_provisioning_enabled block.
         *                                    Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#on_demand_provisioning_enabled SamlConfiguration#on_demand_provisioning_enabled}
         * @return {@code this}
         */
        public Builder onDemandProvisioningEnabled(com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled onDemandProvisioningEnabled) {
            this.onDemandProvisioningEnabled = onDemandProvisioningEnabled;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getRolesAttribute}
         * @param rolesAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#roles_attribute SamlConfiguration#roles_attribute}.
         * @return {@code this}
         */
        public Builder rolesAttribute(java.lang.String rolesAttribute) {
            this.rolesAttribute = rolesAttribute;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getSignAuthnRequest}
         * @param signAuthnRequest Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}.
         * @return {@code this}
         */
        public Builder signAuthnRequest(java.lang.Boolean signAuthnRequest) {
            this.signAuthnRequest = signAuthnRequest;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getSignAuthnRequest}
         * @param signAuthnRequest Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}.
         * @return {@code this}
         */
        public Builder signAuthnRequest(com.hashicorp.cdktf.IResolvable signAuthnRequest) {
            this.signAuthnRequest = signAuthnRequest;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getSpInitiatedLoginEnabled}
         * @param spInitiatedLoginEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}.
         * @return {@code this}
         */
        public Builder spInitiatedLoginEnabled(java.lang.Boolean spInitiatedLoginEnabled) {
            this.spInitiatedLoginEnabled = spInitiatedLoginEnabled;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getSpInitiatedLoginEnabled}
         * @param spInitiatedLoginEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}.
         * @return {@code this}
         */
        public Builder spInitiatedLoginEnabled(com.hashicorp.cdktf.IResolvable spInitiatedLoginEnabled) {
            this.spInitiatedLoginEnabled = spInitiatedLoginEnabled;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getSpInitiatedLoginPath}
         * @param spInitiatedLoginPath Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_path SamlConfiguration#sp_initiated_login_path}.
         * @return {@code this}
         */
        public Builder spInitiatedLoginPath(java.lang.String spInitiatedLoginPath) {
            this.spInitiatedLoginPath = spInitiatedLoginPath;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getX509Cert2}
         * @param x509Cert2 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert2 SamlConfiguration#x509cert2}.
         * @return {@code this}
         */
        public Builder x509Cert2(java.lang.String x509Cert2) {
            this.x509Cert2 = x509Cert2;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getX509Cert3}
         * @param x509Cert3 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert3 SamlConfiguration#x509cert3}.
         * @return {@code this}
         */
        public Builder x509Cert3(java.lang.String x509Cert3) {
            this.x509Cert3 = x509Cert3;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SamlConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SamlConfigurationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SamlConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SamlConfigurationConfig {
        private final java.lang.String configurationName;
        private final java.lang.String issuer;
        private final java.lang.String x509Cert1;
        private final java.lang.String authnRequestUrl;
        private final java.lang.Object debugMode;
        private final java.lang.Object disableRequestedAuthnContext;
        private final java.lang.String emailAttribute;
        private final java.lang.String id;
        private final java.lang.Object isRedirectBinding;
        private final java.lang.Object logoutEnabled;
        private final java.lang.String logoutUrl;
        private final com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled onDemandProvisioningEnabled;
        private final java.lang.String rolesAttribute;
        private final java.lang.Object signAuthnRequest;
        private final java.lang.Object spInitiatedLoginEnabled;
        private final java.lang.String spInitiatedLoginPath;
        private final java.lang.String x509Cert2;
        private final java.lang.String x509Cert3;
        private final java.lang.Object connection;
        private final java.lang.Object count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configurationName = software.amazon.jsii.Kernel.get(this, "configurationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.issuer = software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.x509Cert1 = software.amazon.jsii.Kernel.get(this, "x509Cert1", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.authnRequestUrl = software.amazon.jsii.Kernel.get(this, "authnRequestUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.debugMode = software.amazon.jsii.Kernel.get(this, "debugMode", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.disableRequestedAuthnContext = software.amazon.jsii.Kernel.get(this, "disableRequestedAuthnContext", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.emailAttribute = software.amazon.jsii.Kernel.get(this, "emailAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isRedirectBinding = software.amazon.jsii.Kernel.get(this, "isRedirectBinding", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.logoutEnabled = software.amazon.jsii.Kernel.get(this, "logoutEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.logoutUrl = software.amazon.jsii.Kernel.get(this, "logoutUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.onDemandProvisioningEnabled = software.amazon.jsii.Kernel.get(this, "onDemandProvisioningEnabled", software.amazon.jsii.NativeType.forClass(com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled.class));
            this.rolesAttribute = software.amazon.jsii.Kernel.get(this, "rolesAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.signAuthnRequest = software.amazon.jsii.Kernel.get(this, "signAuthnRequest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.spInitiatedLoginEnabled = software.amazon.jsii.Kernel.get(this, "spInitiatedLoginEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.spInitiatedLoginPath = software.amazon.jsii.Kernel.get(this, "spInitiatedLoginPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.x509Cert2 = software.amazon.jsii.Kernel.get(this, "x509Cert2", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.x509Cert3 = software.amazon.jsii.Kernel.get(this, "x509Cert3", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configurationName = java.util.Objects.requireNonNull(builder.configurationName, "configurationName is required");
            this.issuer = java.util.Objects.requireNonNull(builder.issuer, "issuer is required");
            this.x509Cert1 = java.util.Objects.requireNonNull(builder.x509Cert1, "x509Cert1 is required");
            this.authnRequestUrl = builder.authnRequestUrl;
            this.debugMode = builder.debugMode;
            this.disableRequestedAuthnContext = builder.disableRequestedAuthnContext;
            this.emailAttribute = builder.emailAttribute;
            this.id = builder.id;
            this.isRedirectBinding = builder.isRedirectBinding;
            this.logoutEnabled = builder.logoutEnabled;
            this.logoutUrl = builder.logoutUrl;
            this.onDemandProvisioningEnabled = builder.onDemandProvisioningEnabled;
            this.rolesAttribute = builder.rolesAttribute;
            this.signAuthnRequest = builder.signAuthnRequest;
            this.spInitiatedLoginEnabled = builder.spInitiatedLoginEnabled;
            this.spInitiatedLoginPath = builder.spInitiatedLoginPath;
            this.x509Cert2 = builder.x509Cert2;
            this.x509Cert3 = builder.x509Cert3;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getConfigurationName() {
            return this.configurationName;
        }

        @Override
        public final java.lang.String getIssuer() {
            return this.issuer;
        }

        @Override
        public final java.lang.String getX509Cert1() {
            return this.x509Cert1;
        }

        @Override
        public final java.lang.String getAuthnRequestUrl() {
            return this.authnRequestUrl;
        }

        @Override
        public final java.lang.Object getDebugMode() {
            return this.debugMode;
        }

        @Override
        public final java.lang.Object getDisableRequestedAuthnContext() {
            return this.disableRequestedAuthnContext;
        }

        @Override
        public final java.lang.String getEmailAttribute() {
            return this.emailAttribute;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getIsRedirectBinding() {
            return this.isRedirectBinding;
        }

        @Override
        public final java.lang.Object getLogoutEnabled() {
            return this.logoutEnabled;
        }

        @Override
        public final java.lang.String getLogoutUrl() {
            return this.logoutUrl;
        }

        @Override
        public final com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled getOnDemandProvisioningEnabled() {
            return this.onDemandProvisioningEnabled;
        }

        @Override
        public final java.lang.String getRolesAttribute() {
            return this.rolesAttribute;
        }

        @Override
        public final java.lang.Object getSignAuthnRequest() {
            return this.signAuthnRequest;
        }

        @Override
        public final java.lang.Object getSpInitiatedLoginEnabled() {
            return this.spInitiatedLoginEnabled;
        }

        @Override
        public final java.lang.String getSpInitiatedLoginPath() {
            return this.spInitiatedLoginPath;
        }

        @Override
        public final java.lang.String getX509Cert2() {
            return this.x509Cert2;
        }

        @Override
        public final java.lang.String getX509Cert3() {
            return this.x509Cert3;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Object getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("configurationName", om.valueToTree(this.getConfigurationName()));
            data.set("issuer", om.valueToTree(this.getIssuer()));
            data.set("x509Cert1", om.valueToTree(this.getX509Cert1()));
            if (this.getAuthnRequestUrl() != null) {
                data.set("authnRequestUrl", om.valueToTree(this.getAuthnRequestUrl()));
            }
            if (this.getDebugMode() != null) {
                data.set("debugMode", om.valueToTree(this.getDebugMode()));
            }
            if (this.getDisableRequestedAuthnContext() != null) {
                data.set("disableRequestedAuthnContext", om.valueToTree(this.getDisableRequestedAuthnContext()));
            }
            if (this.getEmailAttribute() != null) {
                data.set("emailAttribute", om.valueToTree(this.getEmailAttribute()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIsRedirectBinding() != null) {
                data.set("isRedirectBinding", om.valueToTree(this.getIsRedirectBinding()));
            }
            if (this.getLogoutEnabled() != null) {
                data.set("logoutEnabled", om.valueToTree(this.getLogoutEnabled()));
            }
            if (this.getLogoutUrl() != null) {
                data.set("logoutUrl", om.valueToTree(this.getLogoutUrl()));
            }
            if (this.getOnDemandProvisioningEnabled() != null) {
                data.set("onDemandProvisioningEnabled", om.valueToTree(this.getOnDemandProvisioningEnabled()));
            }
            if (this.getRolesAttribute() != null) {
                data.set("rolesAttribute", om.valueToTree(this.getRolesAttribute()));
            }
            if (this.getSignAuthnRequest() != null) {
                data.set("signAuthnRequest", om.valueToTree(this.getSignAuthnRequest()));
            }
            if (this.getSpInitiatedLoginEnabled() != null) {
                data.set("spInitiatedLoginEnabled", om.valueToTree(this.getSpInitiatedLoginEnabled()));
            }
            if (this.getSpInitiatedLoginPath() != null) {
                data.set("spInitiatedLoginPath", om.valueToTree(this.getSpInitiatedLoginPath()));
            }
            if (this.getX509Cert2() != null) {
                data.set("x509Cert2", om.valueToTree(this.getX509Cert2()));
            }
            if (this.getX509Cert3() != null) {
                data.set("x509Cert3", om.valueToTree(this.getX509Cert3()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.samlConfiguration.SamlConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SamlConfigurationConfig.Jsii$Proxy that = (SamlConfigurationConfig.Jsii$Proxy) o;

            if (!configurationName.equals(that.configurationName)) return false;
            if (!issuer.equals(that.issuer)) return false;
            if (!x509Cert1.equals(that.x509Cert1)) return false;
            if (this.authnRequestUrl != null ? !this.authnRequestUrl.equals(that.authnRequestUrl) : that.authnRequestUrl != null) return false;
            if (this.debugMode != null ? !this.debugMode.equals(that.debugMode) : that.debugMode != null) return false;
            if (this.disableRequestedAuthnContext != null ? !this.disableRequestedAuthnContext.equals(that.disableRequestedAuthnContext) : that.disableRequestedAuthnContext != null) return false;
            if (this.emailAttribute != null ? !this.emailAttribute.equals(that.emailAttribute) : that.emailAttribute != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.isRedirectBinding != null ? !this.isRedirectBinding.equals(that.isRedirectBinding) : that.isRedirectBinding != null) return false;
            if (this.logoutEnabled != null ? !this.logoutEnabled.equals(that.logoutEnabled) : that.logoutEnabled != null) return false;
            if (this.logoutUrl != null ? !this.logoutUrl.equals(that.logoutUrl) : that.logoutUrl != null) return false;
            if (this.onDemandProvisioningEnabled != null ? !this.onDemandProvisioningEnabled.equals(that.onDemandProvisioningEnabled) : that.onDemandProvisioningEnabled != null) return false;
            if (this.rolesAttribute != null ? !this.rolesAttribute.equals(that.rolesAttribute) : that.rolesAttribute != null) return false;
            if (this.signAuthnRequest != null ? !this.signAuthnRequest.equals(that.signAuthnRequest) : that.signAuthnRequest != null) return false;
            if (this.spInitiatedLoginEnabled != null ? !this.spInitiatedLoginEnabled.equals(that.spInitiatedLoginEnabled) : that.spInitiatedLoginEnabled != null) return false;
            if (this.spInitiatedLoginPath != null ? !this.spInitiatedLoginPath.equals(that.spInitiatedLoginPath) : that.spInitiatedLoginPath != null) return false;
            if (this.x509Cert2 != null ? !this.x509Cert2.equals(that.x509Cert2) : that.x509Cert2 != null) return false;
            if (this.x509Cert3 != null ? !this.x509Cert3.equals(that.x509Cert3) : that.x509Cert3 != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.configurationName.hashCode();
            result = 31 * result + (this.issuer.hashCode());
            result = 31 * result + (this.x509Cert1.hashCode());
            result = 31 * result + (this.authnRequestUrl != null ? this.authnRequestUrl.hashCode() : 0);
            result = 31 * result + (this.debugMode != null ? this.debugMode.hashCode() : 0);
            result = 31 * result + (this.disableRequestedAuthnContext != null ? this.disableRequestedAuthnContext.hashCode() : 0);
            result = 31 * result + (this.emailAttribute != null ? this.emailAttribute.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.isRedirectBinding != null ? this.isRedirectBinding.hashCode() : 0);
            result = 31 * result + (this.logoutEnabled != null ? this.logoutEnabled.hashCode() : 0);
            result = 31 * result + (this.logoutUrl != null ? this.logoutUrl.hashCode() : 0);
            result = 31 * result + (this.onDemandProvisioningEnabled != null ? this.onDemandProvisioningEnabled.hashCode() : 0);
            result = 31 * result + (this.rolesAttribute != null ? this.rolesAttribute.hashCode() : 0);
            result = 31 * result + (this.signAuthnRequest != null ? this.signAuthnRequest.hashCode() : 0);
            result = 31 * result + (this.spInitiatedLoginEnabled != null ? this.spInitiatedLoginEnabled.hashCode() : 0);
            result = 31 * result + (this.spInitiatedLoginPath != null ? this.spInitiatedLoginPath.hashCode() : 0);
            result = 31 * result + (this.x509Cert2 != null ? this.x509Cert2.hashCode() : 0);
            result = 31 * result + (this.x509Cert3 != null ? this.x509Cert3.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
