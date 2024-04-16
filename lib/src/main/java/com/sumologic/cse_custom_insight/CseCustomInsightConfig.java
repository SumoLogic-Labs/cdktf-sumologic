package com.sumologic.cse_custom_insight;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.667Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseCustomInsight.CseCustomInsightConfig")
@software.amazon.jsii.Jsii.Proxy(CseCustomInsightConfig.Jsii$Proxy.class)
public interface CseCustomInsightConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#description CseCustomInsight#description}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDescription();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#enabled CseCustomInsight#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#name CseCustomInsight#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#ordered CseCustomInsight#ordered}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getOrdered();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#severity CseCustomInsight#severity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSeverity();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#tags CseCustomInsight#tags}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTags();

    /**
     * dynamic_severity block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#dynamic_severity CseCustomInsight#dynamic_severity}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDynamicSeverity() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#id CseCustomInsight#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#rule_ids CseCustomInsight#rule_ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRuleIds() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#signal_names CseCustomInsight#signal_names}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSignalNames() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseCustomInsightConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseCustomInsightConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseCustomInsightConfig> {
        java.lang.String description;
        java.lang.Object enabled;
        java.lang.String name;
        java.lang.Object ordered;
        java.lang.String severity;
        java.util.List<java.lang.String> tags;
        java.lang.Object dynamicSeverity;
        java.lang.String id;
        java.util.List<java.lang.String> ruleIds;
        java.util.List<java.lang.String> signalNames;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CseCustomInsightConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#description CseCustomInsight#description}. This parameter is required.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#enabled CseCustomInsight#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#enabled CseCustomInsight#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#name CseCustomInsight#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getOrdered}
         * @param ordered Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#ordered CseCustomInsight#ordered}. This parameter is required.
         * @return {@code this}
         */
        public Builder ordered(java.lang.Boolean ordered) {
            this.ordered = ordered;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getOrdered}
         * @param ordered Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#ordered CseCustomInsight#ordered}. This parameter is required.
         * @return {@code this}
         */
        public Builder ordered(com.hashicorp.cdktf.IResolvable ordered) {
            this.ordered = ordered;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getSeverity}
         * @param severity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#severity CseCustomInsight#severity}. This parameter is required.
         * @return {@code this}
         */
        public Builder severity(java.lang.String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#tags CseCustomInsight#tags}. This parameter is required.
         * @return {@code this}
         */
        public Builder tags(java.util.List<java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getDynamicSeverity}
         * @param dynamicSeverity dynamic_severity block.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#dynamic_severity CseCustomInsight#dynamic_severity}
         * @return {@code this}
         */
        public Builder dynamicSeverity(com.hashicorp.cdktf.IResolvable dynamicSeverity) {
            this.dynamicSeverity = dynamicSeverity;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getDynamicSeverity}
         * @param dynamicSeverity dynamic_severity block.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#dynamic_severity CseCustomInsight#dynamic_severity}
         * @return {@code this}
         */
        public Builder dynamicSeverity(java.util.List<? extends com.sumologic.cse_custom_insight.CseCustomInsightDynamicSeverity> dynamicSeverity) {
            this.dynamicSeverity = dynamicSeverity;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#id CseCustomInsight#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getRuleIds}
         * @param ruleIds Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#rule_ids CseCustomInsight#rule_ids}.
         * @return {@code this}
         */
        public Builder ruleIds(java.util.List<java.lang.String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getSignalNames}
         * @param signalNames Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_custom_insight#signal_names CseCustomInsight#signal_names}.
         * @return {@code this}
         */
        public Builder signalNames(java.util.List<java.lang.String> signalNames) {
            this.signalNames = signalNames;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getDependsOn}
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
         * Sets the value of {@link CseCustomInsightConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CseCustomInsightConfig#getProvisioners}
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
         * @return a new instance of {@link CseCustomInsightConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseCustomInsightConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseCustomInsightConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseCustomInsightConfig {
        private final java.lang.String description;
        private final java.lang.Object enabled;
        private final java.lang.String name;
        private final java.lang.Object ordered;
        private final java.lang.String severity;
        private final java.util.List<java.lang.String> tags;
        private final java.lang.Object dynamicSeverity;
        private final java.lang.String id;
        private final java.util.List<java.lang.String> ruleIds;
        private final java.util.List<java.lang.String> signalNames;
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
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ordered = software.amazon.jsii.Kernel.get(this, "ordered", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.severity = software.amazon.jsii.Kernel.get(this, "severity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.dynamicSeverity = software.amazon.jsii.Kernel.get(this, "dynamicSeverity", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ruleIds = software.amazon.jsii.Kernel.get(this, "ruleIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.signalNames = software.amazon.jsii.Kernel.get(this, "signalNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
            this.description = java.util.Objects.requireNonNull(builder.description, "description is required");
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.ordered = java.util.Objects.requireNonNull(builder.ordered, "ordered is required");
            this.severity = java.util.Objects.requireNonNull(builder.severity, "severity is required");
            this.tags = java.util.Objects.requireNonNull(builder.tags, "tags is required");
            this.dynamicSeverity = builder.dynamicSeverity;
            this.id = builder.id;
            this.ruleIds = builder.ruleIds;
            this.signalNames = builder.signalNames;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getOrdered() {
            return this.ordered;
        }

        @Override
        public final java.lang.String getSeverity() {
            return this.severity;
        }

        @Override
        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Object getDynamicSeverity() {
            return this.dynamicSeverity;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.util.List<java.lang.String> getRuleIds() {
            return this.ruleIds;
        }

        @Override
        public final java.util.List<java.lang.String> getSignalNames() {
            return this.signalNames;
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

            data.set("description", om.valueToTree(this.getDescription()));
            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("ordered", om.valueToTree(this.getOrdered()));
            data.set("severity", om.valueToTree(this.getSeverity()));
            data.set("tags", om.valueToTree(this.getTags()));
            if (this.getDynamicSeverity() != null) {
                data.set("dynamicSeverity", om.valueToTree(this.getDynamicSeverity()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getRuleIds() != null) {
                data.set("ruleIds", om.valueToTree(this.getRuleIds()));
            }
            if (this.getSignalNames() != null) {
                data.set("signalNames", om.valueToTree(this.getSignalNames()));
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
            struct.set("fqn", om.valueToTree("sumologic.cseCustomInsight.CseCustomInsightConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseCustomInsightConfig.Jsii$Proxy that = (CseCustomInsightConfig.Jsii$Proxy) o;

            if (!description.equals(that.description)) return false;
            if (!enabled.equals(that.enabled)) return false;
            if (!name.equals(that.name)) return false;
            if (!ordered.equals(that.ordered)) return false;
            if (!severity.equals(that.severity)) return false;
            if (!tags.equals(that.tags)) return false;
            if (this.dynamicSeverity != null ? !this.dynamicSeverity.equals(that.dynamicSeverity) : that.dynamicSeverity != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.ruleIds != null ? !this.ruleIds.equals(that.ruleIds) : that.ruleIds != null) return false;
            if (this.signalNames != null ? !this.signalNames.equals(that.signalNames) : that.signalNames != null) return false;
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
            int result = this.description.hashCode();
            result = 31 * result + (this.enabled.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.ordered.hashCode());
            result = 31 * result + (this.severity.hashCode());
            result = 31 * result + (this.tags.hashCode());
            result = 31 * result + (this.dynamicSeverity != null ? this.dynamicSeverity.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.ruleIds != null ? this.ruleIds.hashCode() : 0);
            result = 31 * result + (this.signalNames != null ? this.signalNames.hashCode() : 0);
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
