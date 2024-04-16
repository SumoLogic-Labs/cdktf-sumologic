package com.sumologic.cse_entity_normalization_configuration;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.686Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseEntityNormalizationConfiguration.CseEntityNormalizationConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(CseEntityNormalizationConfigurationConfig.Jsii$Proxy.class)
public interface CseEntityNormalizationConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getAwsNormalizationEnabled();

    /**
     * domain_mappings block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#domain_mappings CseEntityNormalizationConfiguration#domain_mappings}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getDomainMappings();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getFqdnNormalizationEnabled();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getNormalizeHostnames();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getNormalizeUsernames();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getWindowsNormalizationEnabled();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#default_normalized_domain CseEntityNormalizationConfiguration#default_normalized_domain}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultNormalizedDomain() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#id CseEntityNormalizationConfiguration#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseEntityNormalizationConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseEntityNormalizationConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseEntityNormalizationConfigurationConfig> {
        java.lang.Object awsNormalizationEnabled;
        java.lang.Object domainMappings;
        java.lang.Object fqdnNormalizationEnabled;
        java.lang.Object normalizeHostnames;
        java.lang.Object normalizeUsernames;
        java.lang.Object windowsNormalizationEnabled;
        java.lang.String defaultNormalizedDomain;
        java.lang.String id;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getAwsNormalizationEnabled}
         * @param awsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder awsNormalizationEnabled(java.lang.Boolean awsNormalizationEnabled) {
            this.awsNormalizationEnabled = awsNormalizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getAwsNormalizationEnabled}
         * @param awsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#aws_normalization_enabled CseEntityNormalizationConfiguration#aws_normalization_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder awsNormalizationEnabled(com.hashicorp.cdktf.IResolvable awsNormalizationEnabled) {
            this.awsNormalizationEnabled = awsNormalizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getDomainMappings}
         * @param domainMappings domain_mappings block. This parameter is required.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#domain_mappings CseEntityNormalizationConfiguration#domain_mappings}
         * @return {@code this}
         */
        public Builder domainMappings(com.hashicorp.cdktf.IResolvable domainMappings) {
            this.domainMappings = domainMappings;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getDomainMappings}
         * @param domainMappings domain_mappings block. This parameter is required.
         *                       Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#domain_mappings CseEntityNormalizationConfiguration#domain_mappings}
         * @return {@code this}
         */
        public Builder domainMappings(java.util.List<? extends com.sumologic.cse_entity_normalization_configuration.CseEntityNormalizationConfigurationDomainMappings> domainMappings) {
            this.domainMappings = domainMappings;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getFqdnNormalizationEnabled}
         * @param fqdnNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder fqdnNormalizationEnabled(java.lang.Boolean fqdnNormalizationEnabled) {
            this.fqdnNormalizationEnabled = fqdnNormalizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getFqdnNormalizationEnabled}
         * @param fqdnNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#fqdn_normalization_enabled CseEntityNormalizationConfiguration#fqdn_normalization_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder fqdnNormalizationEnabled(com.hashicorp.cdktf.IResolvable fqdnNormalizationEnabled) {
            this.fqdnNormalizationEnabled = fqdnNormalizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getNormalizeHostnames}
         * @param normalizeHostnames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}. This parameter is required.
         * @return {@code this}
         */
        public Builder normalizeHostnames(java.lang.Boolean normalizeHostnames) {
            this.normalizeHostnames = normalizeHostnames;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getNormalizeHostnames}
         * @param normalizeHostnames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_hostnames CseEntityNormalizationConfiguration#normalize_hostnames}. This parameter is required.
         * @return {@code this}
         */
        public Builder normalizeHostnames(com.hashicorp.cdktf.IResolvable normalizeHostnames) {
            this.normalizeHostnames = normalizeHostnames;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getNormalizeUsernames}
         * @param normalizeUsernames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}. This parameter is required.
         * @return {@code this}
         */
        public Builder normalizeUsernames(java.lang.Boolean normalizeUsernames) {
            this.normalizeUsernames = normalizeUsernames;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getNormalizeUsernames}
         * @param normalizeUsernames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#normalize_usernames CseEntityNormalizationConfiguration#normalize_usernames}. This parameter is required.
         * @return {@code this}
         */
        public Builder normalizeUsernames(com.hashicorp.cdktf.IResolvable normalizeUsernames) {
            this.normalizeUsernames = normalizeUsernames;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getWindowsNormalizationEnabled}
         * @param windowsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder windowsNormalizationEnabled(java.lang.Boolean windowsNormalizationEnabled) {
            this.windowsNormalizationEnabled = windowsNormalizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getWindowsNormalizationEnabled}
         * @param windowsNormalizationEnabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#windows_normalization_enabled CseEntityNormalizationConfiguration#windows_normalization_enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder windowsNormalizationEnabled(com.hashicorp.cdktf.IResolvable windowsNormalizationEnabled) {
            this.windowsNormalizationEnabled = windowsNormalizationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getDefaultNormalizedDomain}
         * @param defaultNormalizedDomain Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#default_normalized_domain CseEntityNormalizationConfiguration#default_normalized_domain}.
         * @return {@code this}
         */
        public Builder defaultNormalizedDomain(java.lang.String defaultNormalizedDomain) {
            this.defaultNormalizedDomain = defaultNormalizedDomain;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_entity_normalization_configuration#id CseEntityNormalizationConfiguration#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getDependsOn}
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
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CseEntityNormalizationConfigurationConfig#getProvisioners}
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
         * @return a new instance of {@link CseEntityNormalizationConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseEntityNormalizationConfigurationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseEntityNormalizationConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseEntityNormalizationConfigurationConfig {
        private final java.lang.Object awsNormalizationEnabled;
        private final java.lang.Object domainMappings;
        private final java.lang.Object fqdnNormalizationEnabled;
        private final java.lang.Object normalizeHostnames;
        private final java.lang.Object normalizeUsernames;
        private final java.lang.Object windowsNormalizationEnabled;
        private final java.lang.String defaultNormalizedDomain;
        private final java.lang.String id;
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
            this.awsNormalizationEnabled = software.amazon.jsii.Kernel.get(this, "awsNormalizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.domainMappings = software.amazon.jsii.Kernel.get(this, "domainMappings", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.fqdnNormalizationEnabled = software.amazon.jsii.Kernel.get(this, "fqdnNormalizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.normalizeHostnames = software.amazon.jsii.Kernel.get(this, "normalizeHostnames", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.normalizeUsernames = software.amazon.jsii.Kernel.get(this, "normalizeUsernames", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.windowsNormalizationEnabled = software.amazon.jsii.Kernel.get(this, "windowsNormalizationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.defaultNormalizedDomain = software.amazon.jsii.Kernel.get(this, "defaultNormalizedDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.awsNormalizationEnabled = java.util.Objects.requireNonNull(builder.awsNormalizationEnabled, "awsNormalizationEnabled is required");
            this.domainMappings = java.util.Objects.requireNonNull(builder.domainMappings, "domainMappings is required");
            this.fqdnNormalizationEnabled = java.util.Objects.requireNonNull(builder.fqdnNormalizationEnabled, "fqdnNormalizationEnabled is required");
            this.normalizeHostnames = java.util.Objects.requireNonNull(builder.normalizeHostnames, "normalizeHostnames is required");
            this.normalizeUsernames = java.util.Objects.requireNonNull(builder.normalizeUsernames, "normalizeUsernames is required");
            this.windowsNormalizationEnabled = java.util.Objects.requireNonNull(builder.windowsNormalizationEnabled, "windowsNormalizationEnabled is required");
            this.defaultNormalizedDomain = builder.defaultNormalizedDomain;
            this.id = builder.id;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.Object getAwsNormalizationEnabled() {
            return this.awsNormalizationEnabled;
        }

        @Override
        public final java.lang.Object getDomainMappings() {
            return this.domainMappings;
        }

        @Override
        public final java.lang.Object getFqdnNormalizationEnabled() {
            return this.fqdnNormalizationEnabled;
        }

        @Override
        public final java.lang.Object getNormalizeHostnames() {
            return this.normalizeHostnames;
        }

        @Override
        public final java.lang.Object getNormalizeUsernames() {
            return this.normalizeUsernames;
        }

        @Override
        public final java.lang.Object getWindowsNormalizationEnabled() {
            return this.windowsNormalizationEnabled;
        }

        @Override
        public final java.lang.String getDefaultNormalizedDomain() {
            return this.defaultNormalizedDomain;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
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

            data.set("awsNormalizationEnabled", om.valueToTree(this.getAwsNormalizationEnabled()));
            data.set("domainMappings", om.valueToTree(this.getDomainMappings()));
            data.set("fqdnNormalizationEnabled", om.valueToTree(this.getFqdnNormalizationEnabled()));
            data.set("normalizeHostnames", om.valueToTree(this.getNormalizeHostnames()));
            data.set("normalizeUsernames", om.valueToTree(this.getNormalizeUsernames()));
            data.set("windowsNormalizationEnabled", om.valueToTree(this.getWindowsNormalizationEnabled()));
            if (this.getDefaultNormalizedDomain() != null) {
                data.set("defaultNormalizedDomain", om.valueToTree(this.getDefaultNormalizedDomain()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
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
            struct.set("fqn", om.valueToTree("sumologic.cseEntityNormalizationConfiguration.CseEntityNormalizationConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseEntityNormalizationConfigurationConfig.Jsii$Proxy that = (CseEntityNormalizationConfigurationConfig.Jsii$Proxy) o;

            if (!awsNormalizationEnabled.equals(that.awsNormalizationEnabled)) return false;
            if (!domainMappings.equals(that.domainMappings)) return false;
            if (!fqdnNormalizationEnabled.equals(that.fqdnNormalizationEnabled)) return false;
            if (!normalizeHostnames.equals(that.normalizeHostnames)) return false;
            if (!normalizeUsernames.equals(that.normalizeUsernames)) return false;
            if (!windowsNormalizationEnabled.equals(that.windowsNormalizationEnabled)) return false;
            if (this.defaultNormalizedDomain != null ? !this.defaultNormalizedDomain.equals(that.defaultNormalizedDomain) : that.defaultNormalizedDomain != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
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
            int result = this.awsNormalizationEnabled.hashCode();
            result = 31 * result + (this.domainMappings.hashCode());
            result = 31 * result + (this.fqdnNormalizationEnabled.hashCode());
            result = 31 * result + (this.normalizeHostnames.hashCode());
            result = 31 * result + (this.normalizeUsernames.hashCode());
            result = 31 * result + (this.windowsNormalizationEnabled.hashCode());
            result = 31 * result + (this.defaultNormalizedDomain != null ? this.defaultNormalizedDomain.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
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
