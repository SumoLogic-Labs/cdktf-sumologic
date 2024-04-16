package com.sumologic.saml_configuration;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration sumologic_saml_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.181Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.samlConfiguration.SamlConfiguration")
public class SamlConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected SamlConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SamlConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.saml_configuration.SamlConfiguration.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration sumologic_saml_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SamlConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.saml_configuration.SamlConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a SamlConfiguration resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the SamlConfiguration to import. This parameter is required.
     * @param importFromId The id of the existing SamlConfiguration that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the SamlConfiguration to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.saml_configuration.SamlConfiguration.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a SamlConfiguration resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the SamlConfiguration to import. This parameter is required.
     * @param importFromId The id of the existing SamlConfiguration that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.saml_configuration.SamlConfiguration.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putOnDemandProvisioningEnabled(final @org.jetbrains.annotations.NotNull com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled value) {
        software.amazon.jsii.Kernel.call(this, "putOnDemandProvisioningEnabled", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAuthnRequestUrl() {
        software.amazon.jsii.Kernel.call(this, "resetAuthnRequestUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDebugMode() {
        software.amazon.jsii.Kernel.call(this, "resetDebugMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisableRequestedAuthnContext() {
        software.amazon.jsii.Kernel.call(this, "resetDisableRequestedAuthnContext", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEmailAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetEmailAttribute", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsRedirectBinding() {
        software.amazon.jsii.Kernel.call(this, "resetIsRedirectBinding", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogoutEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetLogoutEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogoutUrl() {
        software.amazon.jsii.Kernel.call(this, "resetLogoutUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnDemandProvisioningEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetOnDemandProvisioningEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRolesAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetRolesAttribute", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSignAuthnRequest() {
        software.amazon.jsii.Kernel.call(this, "resetSignAuthnRequest", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpInitiatedLoginEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetSpInitiatedLoginEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpInitiatedLoginPath() {
        software.amazon.jsii.Kernel.call(this, "resetSpInitiatedLoginPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetX509Cert2() {
        software.amazon.jsii.Kernel.call(this, "resetX509Cert2", software.amazon.jsii.NativeType.VOID);
    }

    public void resetX509Cert3() {
        software.amazon.jsii.Kernel.call(this, "resetX509Cert3", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getAssertionConsumerUrl() {
        return software.amazon.jsii.Kernel.get(this, "assertionConsumerUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificate() {
        return software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEntityId() {
        return software.amazon.jsii.Kernel.get(this, "entityId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabledOutputReference getOnDemandProvisioningEnabled() {
        return software.amazon.jsii.Kernel.get(this, "onDemandProvisioningEnabled", software.amazon.jsii.NativeType.forClass(com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabledOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthnRequestUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "authnRequestUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigurationNameInput() {
        return software.amazon.jsii.Kernel.get(this, "configurationNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDebugModeInput() {
        return software.amazon.jsii.Kernel.get(this, "debugModeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDisableRequestedAuthnContextInput() {
        return software.amazon.jsii.Kernel.get(this, "disableRequestedAuthnContextInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEmailAttributeInput() {
        return software.amazon.jsii.Kernel.get(this, "emailAttributeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsRedirectBindingInput() {
        return software.amazon.jsii.Kernel.get(this, "isRedirectBindingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIssuerInput() {
        return software.amazon.jsii.Kernel.get(this, "issuerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLogoutEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "logoutEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLogoutUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "logoutUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled getOnDemandProvisioningEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "onDemandProvisioningEnabledInput", software.amazon.jsii.NativeType.forClass(com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRolesAttributeInput() {
        return software.amazon.jsii.Kernel.get(this, "rolesAttributeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSignAuthnRequestInput() {
        return software.amazon.jsii.Kernel.get(this, "signAuthnRequestInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSpInitiatedLoginEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "spInitiatedLoginEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpInitiatedLoginPathInput() {
        return software.amazon.jsii.Kernel.get(this, "spInitiatedLoginPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getX509Cert1Input() {
        return software.amazon.jsii.Kernel.get(this, "x509Cert1Input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getX509Cert2Input() {
        return software.amazon.jsii.Kernel.get(this, "x509Cert2Input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getX509Cert3Input() {
        return software.amazon.jsii.Kernel.get(this, "x509Cert3Input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthnRequestUrl() {
        return software.amazon.jsii.Kernel.get(this, "authnRequestUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthnRequestUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authnRequestUrl", java.util.Objects.requireNonNull(value, "authnRequestUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigurationName() {
        return software.amazon.jsii.Kernel.get(this, "configurationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigurationName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configurationName", java.util.Objects.requireNonNull(value, "configurationName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDebugMode() {
        return software.amazon.jsii.Kernel.get(this, "debugMode", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDebugMode(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "debugMode", java.util.Objects.requireNonNull(value, "debugMode is required"));
    }

    public void setDebugMode(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "debugMode", java.util.Objects.requireNonNull(value, "debugMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDisableRequestedAuthnContext() {
        return software.amazon.jsii.Kernel.get(this, "disableRequestedAuthnContext", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDisableRequestedAuthnContext(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableRequestedAuthnContext", java.util.Objects.requireNonNull(value, "disableRequestedAuthnContext is required"));
    }

    public void setDisableRequestedAuthnContext(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "disableRequestedAuthnContext", java.util.Objects.requireNonNull(value, "disableRequestedAuthnContext is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEmailAttribute() {
        return software.amazon.jsii.Kernel.get(this, "emailAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEmailAttribute(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "emailAttribute", java.util.Objects.requireNonNull(value, "emailAttribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsRedirectBinding() {
        return software.amazon.jsii.Kernel.get(this, "isRedirectBinding", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsRedirectBinding(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isRedirectBinding", java.util.Objects.requireNonNull(value, "isRedirectBinding is required"));
    }

    public void setIsRedirectBinding(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isRedirectBinding", java.util.Objects.requireNonNull(value, "isRedirectBinding is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIssuer() {
        return software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIssuer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "issuer", java.util.Objects.requireNonNull(value, "issuer is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getLogoutEnabled() {
        return software.amazon.jsii.Kernel.get(this, "logoutEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setLogoutEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "logoutEnabled", java.util.Objects.requireNonNull(value, "logoutEnabled is required"));
    }

    public void setLogoutEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "logoutEnabled", java.util.Objects.requireNonNull(value, "logoutEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogoutUrl() {
        return software.amazon.jsii.Kernel.get(this, "logoutUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogoutUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logoutUrl", java.util.Objects.requireNonNull(value, "logoutUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRolesAttribute() {
        return software.amazon.jsii.Kernel.get(this, "rolesAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRolesAttribute(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rolesAttribute", java.util.Objects.requireNonNull(value, "rolesAttribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSignAuthnRequest() {
        return software.amazon.jsii.Kernel.get(this, "signAuthnRequest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSignAuthnRequest(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "signAuthnRequest", java.util.Objects.requireNonNull(value, "signAuthnRequest is required"));
    }

    public void setSignAuthnRequest(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "signAuthnRequest", java.util.Objects.requireNonNull(value, "signAuthnRequest is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSpInitiatedLoginEnabled() {
        return software.amazon.jsii.Kernel.get(this, "spInitiatedLoginEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSpInitiatedLoginEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "spInitiatedLoginEnabled", java.util.Objects.requireNonNull(value, "spInitiatedLoginEnabled is required"));
    }

    public void setSpInitiatedLoginEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "spInitiatedLoginEnabled", java.util.Objects.requireNonNull(value, "spInitiatedLoginEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpInitiatedLoginPath() {
        return software.amazon.jsii.Kernel.get(this, "spInitiatedLoginPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpInitiatedLoginPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spInitiatedLoginPath", java.util.Objects.requireNonNull(value, "spInitiatedLoginPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getX509Cert1() {
        return software.amazon.jsii.Kernel.get(this, "x509Cert1", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setX509Cert1(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "x509Cert1", java.util.Objects.requireNonNull(value, "x509Cert1 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getX509Cert2() {
        return software.amazon.jsii.Kernel.get(this, "x509Cert2", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setX509Cert2(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "x509Cert2", java.util.Objects.requireNonNull(value, "x509Cert2 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getX509Cert3() {
        return software.amazon.jsii.Kernel.get(this, "x509Cert3", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setX509Cert3(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "x509Cert3", java.util.Objects.requireNonNull(value, "x509Cert3 is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.saml_configuration.SamlConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.saml_configuration.SamlConfiguration> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final com.sumologic.saml_configuration.SamlConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.saml_configuration.SamlConfigurationConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }
        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final com.hashicorp.cdktf.TerraformCount count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#configuration_name SamlConfiguration#configuration_name}.
         * <p>
         * @return {@code this}
         * @param configurationName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#configuration_name SamlConfiguration#configuration_name}. This parameter is required.
         */
        public Builder configurationName(final java.lang.String configurationName) {
            this.config.configurationName(configurationName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#issuer SamlConfiguration#issuer}.
         * <p>
         * @return {@code this}
         * @param issuer Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#issuer SamlConfiguration#issuer}. This parameter is required.
         */
        public Builder issuer(final java.lang.String issuer) {
            this.config.issuer(issuer);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert1 SamlConfiguration#x509cert1}.
         * <p>
         * @return {@code this}
         * @param x509Cert1 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert1 SamlConfiguration#x509cert1}. This parameter is required.
         */
        public Builder x509Cert1(final java.lang.String x509Cert1) {
            this.config.x509Cert1(x509Cert1);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#authn_request_url SamlConfiguration#authn_request_url}.
         * <p>
         * @return {@code this}
         * @param authnRequestUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#authn_request_url SamlConfiguration#authn_request_url}. This parameter is required.
         */
        public Builder authnRequestUrl(final java.lang.String authnRequestUrl) {
            this.config.authnRequestUrl(authnRequestUrl);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}.
         * <p>
         * @return {@code this}
         * @param debugMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}. This parameter is required.
         */
        public Builder debugMode(final java.lang.Boolean debugMode) {
            this.config.debugMode(debugMode);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}.
         * <p>
         * @return {@code this}
         * @param debugMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#debug_mode SamlConfiguration#debug_mode}. This parameter is required.
         */
        public Builder debugMode(final com.hashicorp.cdktf.IResolvable debugMode) {
            this.config.debugMode(debugMode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}.
         * <p>
         * @return {@code this}
         * @param disableRequestedAuthnContext Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}. This parameter is required.
         */
        public Builder disableRequestedAuthnContext(final java.lang.Boolean disableRequestedAuthnContext) {
            this.config.disableRequestedAuthnContext(disableRequestedAuthnContext);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}.
         * <p>
         * @return {@code this}
         * @param disableRequestedAuthnContext Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#disable_requested_authn_context SamlConfiguration#disable_requested_authn_context}. This parameter is required.
         */
        public Builder disableRequestedAuthnContext(final com.hashicorp.cdktf.IResolvable disableRequestedAuthnContext) {
            this.config.disableRequestedAuthnContext(disableRequestedAuthnContext);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#email_attribute SamlConfiguration#email_attribute}.
         * <p>
         * @return {@code this}
         * @param emailAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#email_attribute SamlConfiguration#email_attribute}. This parameter is required.
         */
        public Builder emailAttribute(final java.lang.String emailAttribute) {
            this.config.emailAttribute(emailAttribute);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#id SamlConfiguration#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#id SamlConfiguration#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}.
         * <p>
         * @return {@code this}
         * @param isRedirectBinding Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}. This parameter is required.
         */
        public Builder isRedirectBinding(final java.lang.Boolean isRedirectBinding) {
            this.config.isRedirectBinding(isRedirectBinding);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}.
         * <p>
         * @return {@code this}
         * @param isRedirectBinding Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#is_redirect_binding SamlConfiguration#is_redirect_binding}. This parameter is required.
         */
        public Builder isRedirectBinding(final com.hashicorp.cdktf.IResolvable isRedirectBinding) {
            this.config.isRedirectBinding(isRedirectBinding);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}.
         * <p>
         * @return {@code this}
         * @param logoutEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}. This parameter is required.
         */
        public Builder logoutEnabled(final java.lang.Boolean logoutEnabled) {
            this.config.logoutEnabled(logoutEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}.
         * <p>
         * @return {@code this}
         * @param logoutEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_enabled SamlConfiguration#logout_enabled}. This parameter is required.
         */
        public Builder logoutEnabled(final com.hashicorp.cdktf.IResolvable logoutEnabled) {
            this.config.logoutEnabled(logoutEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_url SamlConfiguration#logout_url}.
         * <p>
         * @return {@code this}
         * @param logoutUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#logout_url SamlConfiguration#logout_url}. This parameter is required.
         */
        public Builder logoutUrl(final java.lang.String logoutUrl) {
            this.config.logoutUrl(logoutUrl);
            return this;
        }

        /**
         * on_demand_provisioning_enabled block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#on_demand_provisioning_enabled SamlConfiguration#on_demand_provisioning_enabled}
         * <p>
         * @return {@code this}
         * @param onDemandProvisioningEnabled on_demand_provisioning_enabled block. This parameter is required.
         */
        public Builder onDemandProvisioningEnabled(final com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled onDemandProvisioningEnabled) {
            this.config.onDemandProvisioningEnabled(onDemandProvisioningEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#roles_attribute SamlConfiguration#roles_attribute}.
         * <p>
         * @return {@code this}
         * @param rolesAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#roles_attribute SamlConfiguration#roles_attribute}. This parameter is required.
         */
        public Builder rolesAttribute(final java.lang.String rolesAttribute) {
            this.config.rolesAttribute(rolesAttribute);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}.
         * <p>
         * @return {@code this}
         * @param signAuthnRequest Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}. This parameter is required.
         */
        public Builder signAuthnRequest(final java.lang.Boolean signAuthnRequest) {
            this.config.signAuthnRequest(signAuthnRequest);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}.
         * <p>
         * @return {@code this}
         * @param signAuthnRequest Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sign_authn_request SamlConfiguration#sign_authn_request}. This parameter is required.
         */
        public Builder signAuthnRequest(final com.hashicorp.cdktf.IResolvable signAuthnRequest) {
            this.config.signAuthnRequest(signAuthnRequest);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}.
         * <p>
         * @return {@code this}
         * @param spInitiatedLoginEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}. This parameter is required.
         */
        public Builder spInitiatedLoginEnabled(final java.lang.Boolean spInitiatedLoginEnabled) {
            this.config.spInitiatedLoginEnabled(spInitiatedLoginEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}.
         * <p>
         * @return {@code this}
         * @param spInitiatedLoginEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_enabled SamlConfiguration#sp_initiated_login_enabled}. This parameter is required.
         */
        public Builder spInitiatedLoginEnabled(final com.hashicorp.cdktf.IResolvable spInitiatedLoginEnabled) {
            this.config.spInitiatedLoginEnabled(spInitiatedLoginEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_path SamlConfiguration#sp_initiated_login_path}.
         * <p>
         * @return {@code this}
         * @param spInitiatedLoginPath Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#sp_initiated_login_path SamlConfiguration#sp_initiated_login_path}. This parameter is required.
         */
        public Builder spInitiatedLoginPath(final java.lang.String spInitiatedLoginPath) {
            this.config.spInitiatedLoginPath(spInitiatedLoginPath);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert2 SamlConfiguration#x509cert2}.
         * <p>
         * @return {@code this}
         * @param x509Cert2 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert2 SamlConfiguration#x509cert2}. This parameter is required.
         */
        public Builder x509Cert2(final java.lang.String x509Cert2) {
            this.config.x509Cert2(x509Cert2);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert3 SamlConfiguration#x509cert3}.
         * <p>
         * @return {@code this}
         * @param x509Cert3 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#x509cert3 SamlConfiguration#x509cert3}. This parameter is required.
         */
        public Builder x509Cert3(final java.lang.String x509Cert3) {
            this.config.x509Cert3(x509Cert3);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.saml_configuration.SamlConfiguration}.
         */
        @Override
        public com.sumologic.saml_configuration.SamlConfiguration build() {
            return new com.sumologic.saml_configuration.SamlConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
