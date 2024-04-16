package com.sumologic.cse_entity_normalization_configuration;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration sumologic_cse_entity_normalization_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.683Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseEntityNormalizationConfiguration.CseEntityNormalizationConfiguration")
public class CseEntityNormalizationConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected CseEntityNormalizationConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseEntityNormalizationConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration sumologic_cse_entity_normalization_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CseEntityNormalizationConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a CseEntityNormalizationConfiguration resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseEntityNormalizationConfiguration to import. This parameter is required.
     * @param importFromId The id of the existing CseEntityNormalizationConfiguration that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the CseEntityNormalizationConfiguration to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a CseEntityNormalizationConfiguration resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseEntityNormalizationConfiguration to import. This parameter is required.
     * @param importFromId The id of the existing CseEntityNormalizationConfiguration that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putDomainMappings(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappings>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappings> __cast_cd4240 = (java.util.List<com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappings>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappings __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putDomainMappings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDefaultNormalizedDomain() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultNormalizedDomain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappingsList getDomainMappings() {
        return software.amazon.jsii.Kernel.get(this, "domainMappings", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappingsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAwsNormalizationEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "awsNormalizationEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultNormalizedDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultNormalizedDomainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDomainMappingsInput() {
        return software.amazon.jsii.Kernel.get(this, "domainMappingsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFqdnNormalizationEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "fqdnNormalizationEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNormalizeHostnamesInput() {
        return software.amazon.jsii.Kernel.get(this, "normalizeHostnamesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNormalizeUsernamesInput() {
        return software.amazon.jsii.Kernel.get(this, "normalizeUsernamesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getWindowsNormalizationEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "windowsNormalizationEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAwsNormalizationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "awsNormalizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAwsNormalizationEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "awsNormalizationEnabled", java.util.Objects.requireNonNull(value, "awsNormalizationEnabled is required"));
    }

    public void setAwsNormalizationEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "awsNormalizationEnabled", java.util.Objects.requireNonNull(value, "awsNormalizationEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultNormalizedDomain() {
        return software.amazon.jsii.Kernel.get(this, "defaultNormalizedDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultNormalizedDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultNormalizedDomain", java.util.Objects.requireNonNull(value, "defaultNormalizedDomain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getFqdnNormalizationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "fqdnNormalizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setFqdnNormalizationEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fqdnNormalizationEnabled", java.util.Objects.requireNonNull(value, "fqdnNormalizationEnabled is required"));
    }

    public void setFqdnNormalizationEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "fqdnNormalizationEnabled", java.util.Objects.requireNonNull(value, "fqdnNormalizationEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getNormalizeHostnames() {
        return software.amazon.jsii.Kernel.get(this, "normalizeHostnames", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setNormalizeHostnames(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "normalizeHostnames", java.util.Objects.requireNonNull(value, "normalizeHostnames is required"));
    }

    public void setNormalizeHostnames(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "normalizeHostnames", java.util.Objects.requireNonNull(value, "normalizeHostnames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getNormalizeUsernames() {
        return software.amazon.jsii.Kernel.get(this, "normalizeUsernames", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setNormalizeUsernames(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "normalizeUsernames", java.util.Objects.requireNonNull(value, "normalizeUsernames is required"));
    }

    public void setNormalizeUsernames(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "normalizeUsernames", java.util.Objects.requireNonNull(value, "normalizeUsernames is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWindowsNormalizationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "windowsNormalizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWindowsNormalizationEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "windowsNormalizationEnabled", java.util.Objects.requireNonNull(value, "windowsNormalizationEnabled is required"));
    }

    public void setWindowsNormalizationEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "windowsNormalizationEnabled", java.util.Objects.requireNonNull(value, "windowsNormalizationEnabled is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration> {
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
        private final com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}.
         * <p>
         * @return {@code this}
         * @param awsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}. This parameter is required.
         */
        public Builder awsNormalizationEnabled(final java.lang.Boolean awsNormalizationEnabled) {
            this.config.awsNormalizationEnabled(awsNormalizationEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}.
         * <p>
         * @return {@code this}
         * @param awsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}. This parameter is required.
         */
        public Builder awsNormalizationEnabled(final com.hashicorp.cdktf.IResolvable awsNormalizationEnabled) {
            this.config.awsNormalizationEnabled(awsNormalizationEnabled);
            return this;
        }

        /**
         * domain_mappings block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#domain_mappings CseEntityNormalizationConfiguration#domain_mappings}
         * <p>
         * @return {@code this}
         * @param domainMappings domain_mappings block. This parameter is required.
         */
        public Builder domainMappings(final com.hashicorp.cdktf.IResolvable domainMappings) {
            this.config.domainMappings(domainMappings);
            return this;
        }
        /**
         * domain_mappings block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#domain_mappings CseEntityNormalizationConfiguration#domain_mappings}
         * <p>
         * @return {@code this}
         * @param domainMappings domain_mappings block. This parameter is required.
         */
        public Builder domainMappings(final java.util.List<? extends com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappings> domainMappings) {
            this.config.domainMappings(domainMappings);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}.
         * <p>
         * @return {@code this}
         * @param fqdnNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}. This parameter is required.
         */
        public Builder fqdnNormalizationEnabled(final java.lang.Boolean fqdnNormalizationEnabled) {
            this.config.fqdnNormalizationEnabled(fqdnNormalizationEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}.
         * <p>
         * @return {@code this}
         * @param fqdnNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}. This parameter is required.
         */
        public Builder fqdnNormalizationEnabled(final com.hashicorp.cdktf.IResolvable fqdnNormalizationEnabled) {
            this.config.fqdnNormalizationEnabled(fqdnNormalizationEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}.
         * <p>
         * @return {@code this}
         * @param normalizeHostnames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}. This parameter is required.
         */
        public Builder normalizeHostnames(final java.lang.Boolean normalizeHostnames) {
            this.config.normalizeHostnames(normalizeHostnames);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}.
         * <p>
         * @return {@code this}
         * @param normalizeHostnames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}. This parameter is required.
         */
        public Builder normalizeHostnames(final com.hashicorp.cdktf.IResolvable normalizeHostnames) {
            this.config.normalizeHostnames(normalizeHostnames);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}.
         * <p>
         * @return {@code this}
         * @param normalizeUsernames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}. This parameter is required.
         */
        public Builder normalizeUsernames(final java.lang.Boolean normalizeUsernames) {
            this.config.normalizeUsernames(normalizeUsernames);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}.
         * <p>
         * @return {@code this}
         * @param normalizeUsernames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}. This parameter is required.
         */
        public Builder normalizeUsernames(final com.hashicorp.cdktf.IResolvable normalizeUsernames) {
            this.config.normalizeUsernames(normalizeUsernames);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}.
         * <p>
         * @return {@code this}
         * @param windowsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}. This parameter is required.
         */
        public Builder windowsNormalizationEnabled(final java.lang.Boolean windowsNormalizationEnabled) {
            this.config.windowsNormalizationEnabled(windowsNormalizationEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}.
         * <p>
         * @return {@code this}
         * @param windowsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}. This parameter is required.
         */
        public Builder windowsNormalizationEnabled(final com.hashicorp.cdktf.IResolvable windowsNormalizationEnabled) {
            this.config.windowsNormalizationEnabled(windowsNormalizationEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#default_normalized_domain CseEntityNormalizationConfiguration#default_normalized_domain}.
         * <p>
         * @return {@code this}
         * @param defaultNormalizedDomain Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#default_normalized_domain CseEntityNormalizationConfiguration#default_normalized_domain}. This parameter is required.
         */
        public Builder defaultNormalizedDomain(final java.lang.String defaultNormalizedDomain) {
            this.config.defaultNormalizedDomain(defaultNormalizedDomain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#id CseEntityNormalizationConfiguration#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#id CseEntityNormalizationConfiguration#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration}.
         */
        @Override
        public com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration build() {
            return new com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
