package com.sumologic.cse_chain_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.628Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseChainRule.CseChainRuleConfig")
@software.amazon.jsii.Jsii.Proxy(CseChainRuleConfig.Jsii$Proxy.class)
public interface CseChainRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#description CseChainRule#description}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDescription();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#enabled CseChainRule#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * entity_selectors block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#entity_selectors CseChainRule#entity_selectors}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEntitySelectors();

    /**
     * expressions_and_limits block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#expressions_and_limits CseChainRule#expressions_and_limits}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getExpressionsAndLimits();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#name CseChainRule#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#severity CseChainRule#severity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getSeverity();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#window_size CseChainRule#window_size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWindowSize();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#group_by_fields CseChainRule#group_by_fields}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroupByFields() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#id CseChainRule#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#is_prototype CseChainRule#is_prototype}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsPrototype() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#ordered CseChainRule#ordered}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getOrdered() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#summary_expression CseChainRule#summary_expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSummaryExpression() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#suppression_window_size CseChainRule#suppression_window_size}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuppressionWindowSize() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#tags CseChainRule#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#window_size_millis CseChainRule#window_size_millis}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWindowSizeMillis() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseChainRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseChainRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseChainRuleConfig> {
        java.lang.String description;
        java.lang.Object enabled;
        java.lang.Object entitySelectors;
        java.lang.Object expressionsAndLimits;
        java.lang.String name;
        java.lang.Number severity;
        java.lang.String windowSize;
        java.util.List<java.lang.String> groupByFields;
        java.lang.String id;
        java.lang.Object isPrototype;
        java.lang.Object ordered;
        java.lang.String summaryExpression;
        java.lang.Number suppressionWindowSize;
        java.util.List<java.lang.String> tags;
        java.lang.String windowSizeMillis;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link CseChainRuleConfig#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#description CseChainRule#description}. This parameter is required.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#enabled CseChainRule#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#enabled CseChainRule#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getEntitySelectors}
         * @param entitySelectors entity_selectors block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#entity_selectors CseChainRule#entity_selectors}
         * @return {@code this}
         */
        public Builder entitySelectors(com.hashicorp.cdktf.IResolvable entitySelectors) {
            this.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getEntitySelectors}
         * @param entitySelectors entity_selectors block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#entity_selectors CseChainRule#entity_selectors}
         * @return {@code this}
         */
        public Builder entitySelectors(java.util.List<? extends com.sumologic.cse_chain_rule.CseChainRuleEntitySelectors> entitySelectors) {
            this.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getExpressionsAndLimits}
         * @param expressionsAndLimits expressions_and_limits block. This parameter is required.
         *                             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#expressions_and_limits CseChainRule#expressions_and_limits}
         * @return {@code this}
         */
        public Builder expressionsAndLimits(com.hashicorp.cdktf.IResolvable expressionsAndLimits) {
            this.expressionsAndLimits = expressionsAndLimits;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getExpressionsAndLimits}
         * @param expressionsAndLimits expressions_and_limits block. This parameter is required.
         *                             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#expressions_and_limits CseChainRule#expressions_and_limits}
         * @return {@code this}
         */
        public Builder expressionsAndLimits(java.util.List<? extends com.sumologic.cse_chain_rule.CseChainRuleExpressionsAndLimits> expressionsAndLimits) {
            this.expressionsAndLimits = expressionsAndLimits;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#name CseChainRule#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getSeverity}
         * @param severity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#severity CseChainRule#severity}. This parameter is required.
         * @return {@code this}
         */
        public Builder severity(java.lang.Number severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getWindowSize}
         * @param windowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#window_size CseChainRule#window_size}. This parameter is required.
         * @return {@code this}
         */
        public Builder windowSize(java.lang.String windowSize) {
            this.windowSize = windowSize;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getGroupByFields}
         * @param groupByFields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#group_by_fields CseChainRule#group_by_fields}.
         * @return {@code this}
         */
        public Builder groupByFields(java.util.List<java.lang.String> groupByFields) {
            this.groupByFields = groupByFields;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#id CseChainRule#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getIsPrototype}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#is_prototype CseChainRule#is_prototype}.
         * @return {@code this}
         */
        public Builder isPrototype(java.lang.Boolean isPrototype) {
            this.isPrototype = isPrototype;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getIsPrototype}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#is_prototype CseChainRule#is_prototype}.
         * @return {@code this}
         */
        public Builder isPrototype(com.hashicorp.cdktf.IResolvable isPrototype) {
            this.isPrototype = isPrototype;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getOrdered}
         * @param ordered Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#ordered CseChainRule#ordered}.
         * @return {@code this}
         */
        public Builder ordered(java.lang.Boolean ordered) {
            this.ordered = ordered;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getOrdered}
         * @param ordered Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#ordered CseChainRule#ordered}.
         * @return {@code this}
         */
        public Builder ordered(com.hashicorp.cdktf.IResolvable ordered) {
            this.ordered = ordered;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getSummaryExpression}
         * @param summaryExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#summary_expression CseChainRule#summary_expression}.
         * @return {@code this}
         */
        public Builder summaryExpression(java.lang.String summaryExpression) {
            this.summaryExpression = summaryExpression;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getSuppressionWindowSize}
         * @param suppressionWindowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#suppression_window_size CseChainRule#suppression_window_size}.
         * @return {@code this}
         */
        public Builder suppressionWindowSize(java.lang.Number suppressionWindowSize) {
            this.suppressionWindowSize = suppressionWindowSize;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#tags CseChainRule#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.List<java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getWindowSizeMillis}
         * @param windowSizeMillis Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_chain_rule#window_size_millis CseChainRule#window_size_millis}.
         * @return {@code this}
         */
        public Builder windowSizeMillis(java.lang.String windowSizeMillis) {
            this.windowSizeMillis = windowSizeMillis;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getDependsOn}
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
         * Sets the value of {@link CseChainRuleConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CseChainRuleConfig#getProvisioners}
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
         * @return a new instance of {@link CseChainRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseChainRuleConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseChainRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseChainRuleConfig {
        private final java.lang.String description;
        private final java.lang.Object enabled;
        private final java.lang.Object entitySelectors;
        private final java.lang.Object expressionsAndLimits;
        private final java.lang.String name;
        private final java.lang.Number severity;
        private final java.lang.String windowSize;
        private final java.util.List<java.lang.String> groupByFields;
        private final java.lang.String id;
        private final java.lang.Object isPrototype;
        private final java.lang.Object ordered;
        private final java.lang.String summaryExpression;
        private final java.lang.Number suppressionWindowSize;
        private final java.util.List<java.lang.String> tags;
        private final java.lang.String windowSizeMillis;
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
            this.entitySelectors = software.amazon.jsii.Kernel.get(this, "entitySelectors", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.expressionsAndLimits = software.amazon.jsii.Kernel.get(this, "expressionsAndLimits", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.severity = software.amazon.jsii.Kernel.get(this, "severity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.windowSize = software.amazon.jsii.Kernel.get(this, "windowSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupByFields = software.amazon.jsii.Kernel.get(this, "groupByFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isPrototype = software.amazon.jsii.Kernel.get(this, "isPrototype", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ordered = software.amazon.jsii.Kernel.get(this, "ordered", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.summaryExpression = software.amazon.jsii.Kernel.get(this, "summaryExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.suppressionWindowSize = software.amazon.jsii.Kernel.get(this, "suppressionWindowSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.windowSizeMillis = software.amazon.jsii.Kernel.get(this, "windowSizeMillis", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.entitySelectors = java.util.Objects.requireNonNull(builder.entitySelectors, "entitySelectors is required");
            this.expressionsAndLimits = java.util.Objects.requireNonNull(builder.expressionsAndLimits, "expressionsAndLimits is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.severity = java.util.Objects.requireNonNull(builder.severity, "severity is required");
            this.windowSize = java.util.Objects.requireNonNull(builder.windowSize, "windowSize is required");
            this.groupByFields = builder.groupByFields;
            this.id = builder.id;
            this.isPrototype = builder.isPrototype;
            this.ordered = builder.ordered;
            this.summaryExpression = builder.summaryExpression;
            this.suppressionWindowSize = builder.suppressionWindowSize;
            this.tags = builder.tags;
            this.windowSizeMillis = builder.windowSizeMillis;
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
        public final java.lang.Object getEntitySelectors() {
            return this.entitySelectors;
        }

        @Override
        public final java.lang.Object getExpressionsAndLimits() {
            return this.expressionsAndLimits;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Number getSeverity() {
            return this.severity;
        }

        @Override
        public final java.lang.String getWindowSize() {
            return this.windowSize;
        }

        @Override
        public final java.util.List<java.lang.String> getGroupByFields() {
            return this.groupByFields;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getIsPrototype() {
            return this.isPrototype;
        }

        @Override
        public final java.lang.Object getOrdered() {
            return this.ordered;
        }

        @Override
        public final java.lang.String getSummaryExpression() {
            return this.summaryExpression;
        }

        @Override
        public final java.lang.Number getSuppressionWindowSize() {
            return this.suppressionWindowSize;
        }

        @Override
        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getWindowSizeMillis() {
            return this.windowSizeMillis;
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
            data.set("entitySelectors", om.valueToTree(this.getEntitySelectors()));
            data.set("expressionsAndLimits", om.valueToTree(this.getExpressionsAndLimits()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("severity", om.valueToTree(this.getSeverity()));
            data.set("windowSize", om.valueToTree(this.getWindowSize()));
            if (this.getGroupByFields() != null) {
                data.set("groupByFields", om.valueToTree(this.getGroupByFields()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIsPrototype() != null) {
                data.set("isPrototype", om.valueToTree(this.getIsPrototype()));
            }
            if (this.getOrdered() != null) {
                data.set("ordered", om.valueToTree(this.getOrdered()));
            }
            if (this.getSummaryExpression() != null) {
                data.set("summaryExpression", om.valueToTree(this.getSummaryExpression()));
            }
            if (this.getSuppressionWindowSize() != null) {
                data.set("suppressionWindowSize", om.valueToTree(this.getSuppressionWindowSize()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getWindowSizeMillis() != null) {
                data.set("windowSizeMillis", om.valueToTree(this.getWindowSizeMillis()));
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
            struct.set("fqn", om.valueToTree("sumologic.cseChainRule.CseChainRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseChainRuleConfig.Jsii$Proxy that = (CseChainRuleConfig.Jsii$Proxy) o;

            if (!description.equals(that.description)) return false;
            if (!enabled.equals(that.enabled)) return false;
            if (!entitySelectors.equals(that.entitySelectors)) return false;
            if (!expressionsAndLimits.equals(that.expressionsAndLimits)) return false;
            if (!name.equals(that.name)) return false;
            if (!severity.equals(that.severity)) return false;
            if (!windowSize.equals(that.windowSize)) return false;
            if (this.groupByFields != null ? !this.groupByFields.equals(that.groupByFields) : that.groupByFields != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.isPrototype != null ? !this.isPrototype.equals(that.isPrototype) : that.isPrototype != null) return false;
            if (this.ordered != null ? !this.ordered.equals(that.ordered) : that.ordered != null) return false;
            if (this.summaryExpression != null ? !this.summaryExpression.equals(that.summaryExpression) : that.summaryExpression != null) return false;
            if (this.suppressionWindowSize != null ? !this.suppressionWindowSize.equals(that.suppressionWindowSize) : that.suppressionWindowSize != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.windowSizeMillis != null ? !this.windowSizeMillis.equals(that.windowSizeMillis) : that.windowSizeMillis != null) return false;
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
            result = 31 * result + (this.entitySelectors.hashCode());
            result = 31 * result + (this.expressionsAndLimits.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.severity.hashCode());
            result = 31 * result + (this.windowSize.hashCode());
            result = 31 * result + (this.groupByFields != null ? this.groupByFields.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.isPrototype != null ? this.isPrototype.hashCode() : 0);
            result = 31 * result + (this.ordered != null ? this.ordered.hashCode() : 0);
            result = 31 * result + (this.summaryExpression != null ? this.summaryExpression.hashCode() : 0);
            result = 31 * result + (this.suppressionWindowSize != null ? this.suppressionWindowSize.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.windowSizeMillis != null ? this.windowSizeMillis.hashCode() : 0);
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
