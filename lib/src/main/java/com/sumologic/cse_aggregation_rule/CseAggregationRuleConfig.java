package com.sumologic.cse_aggregation_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.610Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseAggregationRule.CseAggregationRuleConfig")
@software.amazon.jsii.Jsii.Proxy(CseAggregationRuleConfig.Jsii$Proxy.class)
public interface CseAggregationRuleConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * aggregation_functions block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#aggregation_functions CseAggregationRule#aggregation_functions}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getAggregationFunctions();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#description_expression CseAggregationRule#description_expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDescriptionExpression();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * entity_selectors block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#entity_selectors CseAggregationRule#entity_selectors}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEntitySelectors();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#match_expression CseAggregationRule#match_expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMatchExpression();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name CseAggregationRule#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name_expression CseAggregationRule#name_expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNameExpression();

    /**
     * severity_mapping block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#severity_mapping CseAggregationRule#severity_mapping}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping getSeverityMapping();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#trigger_expression CseAggregationRule#trigger_expression}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTriggerExpression();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size CseAggregationRule#window_size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWindowSize();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getGroupByEntity() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_fields CseAggregationRule#group_by_fields}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroupByFields() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#id CseAggregationRule#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsPrototype() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#summary_expression CseAggregationRule#summary_expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSummaryExpression() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#suppression_window_size CseAggregationRule#suppression_window_size}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuppressionWindowSize() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#tags CseAggregationRule#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size_millis CseAggregationRule#window_size_millis}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWindowSizeMillis() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseAggregationRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseAggregationRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseAggregationRuleConfig> {
        java.lang.Object aggregationFunctions;
        java.lang.String descriptionExpression;
        java.lang.Object enabled;
        java.lang.Object entitySelectors;
        java.lang.String matchExpression;
        java.lang.String name;
        java.lang.String nameExpression;
        com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping severityMapping;
        java.lang.String triggerExpression;
        java.lang.String windowSize;
        java.lang.Object groupByEntity;
        java.util.List<java.lang.String> groupByFields;
        java.lang.String id;
        java.lang.Object isPrototype;
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
         * Sets the value of {@link CseAggregationRuleConfig#getAggregationFunctions}
         * @param aggregationFunctions aggregation_functions block. This parameter is required.
         *                             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#aggregation_functions CseAggregationRule#aggregation_functions}
         * @return {@code this}
         */
        public Builder aggregationFunctions(com.hashicorp.cdktf.IResolvable aggregationFunctions) {
            this.aggregationFunctions = aggregationFunctions;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getAggregationFunctions}
         * @param aggregationFunctions aggregation_functions block. This parameter is required.
         *                             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#aggregation_functions CseAggregationRule#aggregation_functions}
         * @return {@code this}
         */
        public Builder aggregationFunctions(java.util.List<? extends com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctions> aggregationFunctions) {
            this.aggregationFunctions = aggregationFunctions;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getDescriptionExpression}
         * @param descriptionExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#description_expression CseAggregationRule#description_expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder descriptionExpression(java.lang.String descriptionExpression) {
            this.descriptionExpression = descriptionExpression;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getEntitySelectors}
         * @param entitySelectors entity_selectors block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#entity_selectors CseAggregationRule#entity_selectors}
         * @return {@code this}
         */
        public Builder entitySelectors(com.hashicorp.cdktf.IResolvable entitySelectors) {
            this.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getEntitySelectors}
         * @param entitySelectors entity_selectors block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#entity_selectors CseAggregationRule#entity_selectors}
         * @return {@code this}
         */
        public Builder entitySelectors(java.util.List<? extends com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectors> entitySelectors) {
            this.entitySelectors = entitySelectors;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getMatchExpression}
         * @param matchExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#match_expression CseAggregationRule#match_expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder matchExpression(java.lang.String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name CseAggregationRule#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getNameExpression}
         * @param nameExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name_expression CseAggregationRule#name_expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder nameExpression(java.lang.String nameExpression) {
            this.nameExpression = nameExpression;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getSeverityMapping}
         * @param severityMapping severity_mapping block. This parameter is required.
         *                        Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#severity_mapping CseAggregationRule#severity_mapping}
         * @return {@code this}
         */
        public Builder severityMapping(com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping severityMapping) {
            this.severityMapping = severityMapping;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getTriggerExpression}
         * @param triggerExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#trigger_expression CseAggregationRule#trigger_expression}. This parameter is required.
         * @return {@code this}
         */
        public Builder triggerExpression(java.lang.String triggerExpression) {
            this.triggerExpression = triggerExpression;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getWindowSize}
         * @param windowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size CseAggregationRule#window_size}. This parameter is required.
         * @return {@code this}
         */
        public Builder windowSize(java.lang.String windowSize) {
            this.windowSize = windowSize;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getGroupByEntity}
         * @param groupByEntity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}.
         * @return {@code this}
         */
        public Builder groupByEntity(java.lang.Boolean groupByEntity) {
            this.groupByEntity = groupByEntity;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getGroupByEntity}
         * @param groupByEntity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}.
         * @return {@code this}
         */
        public Builder groupByEntity(com.hashicorp.cdktf.IResolvable groupByEntity) {
            this.groupByEntity = groupByEntity;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getGroupByFields}
         * @param groupByFields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_fields CseAggregationRule#group_by_fields}.
         * @return {@code this}
         */
        public Builder groupByFields(java.util.List<java.lang.String> groupByFields) {
            this.groupByFields = groupByFields;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#id CseAggregationRule#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getIsPrototype}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}.
         * @return {@code this}
         */
        public Builder isPrototype(java.lang.Boolean isPrototype) {
            this.isPrototype = isPrototype;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getIsPrototype}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}.
         * @return {@code this}
         */
        public Builder isPrototype(com.hashicorp.cdktf.IResolvable isPrototype) {
            this.isPrototype = isPrototype;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getSummaryExpression}
         * @param summaryExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#summary_expression CseAggregationRule#summary_expression}.
         * @return {@code this}
         */
        public Builder summaryExpression(java.lang.String summaryExpression) {
            this.summaryExpression = summaryExpression;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getSuppressionWindowSize}
         * @param suppressionWindowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#suppression_window_size CseAggregationRule#suppression_window_size}.
         * @return {@code this}
         */
        public Builder suppressionWindowSize(java.lang.Number suppressionWindowSize) {
            this.suppressionWindowSize = suppressionWindowSize;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#tags CseAggregationRule#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.List<java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getWindowSizeMillis}
         * @param windowSizeMillis Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size_millis CseAggregationRule#window_size_millis}.
         * @return {@code this}
         */
        public Builder windowSizeMillis(java.lang.String windowSizeMillis) {
            this.windowSizeMillis = windowSizeMillis;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getDependsOn}
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
         * Sets the value of {@link CseAggregationRuleConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link CseAggregationRuleConfig#getProvisioners}
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
         * @return a new instance of {@link CseAggregationRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseAggregationRuleConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseAggregationRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseAggregationRuleConfig {
        private final java.lang.Object aggregationFunctions;
        private final java.lang.String descriptionExpression;
        private final java.lang.Object enabled;
        private final java.lang.Object entitySelectors;
        private final java.lang.String matchExpression;
        private final java.lang.String name;
        private final java.lang.String nameExpression;
        private final com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping severityMapping;
        private final java.lang.String triggerExpression;
        private final java.lang.String windowSize;
        private final java.lang.Object groupByEntity;
        private final java.util.List<java.lang.String> groupByFields;
        private final java.lang.String id;
        private final java.lang.Object isPrototype;
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
            this.aggregationFunctions = software.amazon.jsii.Kernel.get(this, "aggregationFunctions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.descriptionExpression = software.amazon.jsii.Kernel.get(this, "descriptionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.entitySelectors = software.amazon.jsii.Kernel.get(this, "entitySelectors", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.matchExpression = software.amazon.jsii.Kernel.get(this, "matchExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nameExpression = software.amazon.jsii.Kernel.get(this, "nameExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.severityMapping = software.amazon.jsii.Kernel.get(this, "severityMapping", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping.class));
            this.triggerExpression = software.amazon.jsii.Kernel.get(this, "triggerExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.windowSize = software.amazon.jsii.Kernel.get(this, "windowSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupByEntity = software.amazon.jsii.Kernel.get(this, "groupByEntity", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.groupByFields = software.amazon.jsii.Kernel.get(this, "groupByFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isPrototype = software.amazon.jsii.Kernel.get(this, "isPrototype", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.aggregationFunctions = java.util.Objects.requireNonNull(builder.aggregationFunctions, "aggregationFunctions is required");
            this.descriptionExpression = java.util.Objects.requireNonNull(builder.descriptionExpression, "descriptionExpression is required");
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
            this.entitySelectors = java.util.Objects.requireNonNull(builder.entitySelectors, "entitySelectors is required");
            this.matchExpression = java.util.Objects.requireNonNull(builder.matchExpression, "matchExpression is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.nameExpression = java.util.Objects.requireNonNull(builder.nameExpression, "nameExpression is required");
            this.severityMapping = java.util.Objects.requireNonNull(builder.severityMapping, "severityMapping is required");
            this.triggerExpression = java.util.Objects.requireNonNull(builder.triggerExpression, "triggerExpression is required");
            this.windowSize = java.util.Objects.requireNonNull(builder.windowSize, "windowSize is required");
            this.groupByEntity = builder.groupByEntity;
            this.groupByFields = builder.groupByFields;
            this.id = builder.id;
            this.isPrototype = builder.isPrototype;
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
        public final java.lang.Object getAggregationFunctions() {
            return this.aggregationFunctions;
        }

        @Override
        public final java.lang.String getDescriptionExpression() {
            return this.descriptionExpression;
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
        public final java.lang.String getMatchExpression() {
            return this.matchExpression;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNameExpression() {
            return this.nameExpression;
        }

        @Override
        public final com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping getSeverityMapping() {
            return this.severityMapping;
        }

        @Override
        public final java.lang.String getTriggerExpression() {
            return this.triggerExpression;
        }

        @Override
        public final java.lang.String getWindowSize() {
            return this.windowSize;
        }

        @Override
        public final java.lang.Object getGroupByEntity() {
            return this.groupByEntity;
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

            data.set("aggregationFunctions", om.valueToTree(this.getAggregationFunctions()));
            data.set("descriptionExpression", om.valueToTree(this.getDescriptionExpression()));
            data.set("enabled", om.valueToTree(this.getEnabled()));
            data.set("entitySelectors", om.valueToTree(this.getEntitySelectors()));
            data.set("matchExpression", om.valueToTree(this.getMatchExpression()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("nameExpression", om.valueToTree(this.getNameExpression()));
            data.set("severityMapping", om.valueToTree(this.getSeverityMapping()));
            data.set("triggerExpression", om.valueToTree(this.getTriggerExpression()));
            data.set("windowSize", om.valueToTree(this.getWindowSize()));
            if (this.getGroupByEntity() != null) {
                data.set("groupByEntity", om.valueToTree(this.getGroupByEntity()));
            }
            if (this.getGroupByFields() != null) {
                data.set("groupByFields", om.valueToTree(this.getGroupByFields()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIsPrototype() != null) {
                data.set("isPrototype", om.valueToTree(this.getIsPrototype()));
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
            struct.set("fqn", om.valueToTree("sumologic.cseAggregationRule.CseAggregationRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseAggregationRuleConfig.Jsii$Proxy that = (CseAggregationRuleConfig.Jsii$Proxy) o;

            if (!aggregationFunctions.equals(that.aggregationFunctions)) return false;
            if (!descriptionExpression.equals(that.descriptionExpression)) return false;
            if (!enabled.equals(that.enabled)) return false;
            if (!entitySelectors.equals(that.entitySelectors)) return false;
            if (!matchExpression.equals(that.matchExpression)) return false;
            if (!name.equals(that.name)) return false;
            if (!nameExpression.equals(that.nameExpression)) return false;
            if (!severityMapping.equals(that.severityMapping)) return false;
            if (!triggerExpression.equals(that.triggerExpression)) return false;
            if (!windowSize.equals(that.windowSize)) return false;
            if (this.groupByEntity != null ? !this.groupByEntity.equals(that.groupByEntity) : that.groupByEntity != null) return false;
            if (this.groupByFields != null ? !this.groupByFields.equals(that.groupByFields) : that.groupByFields != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.isPrototype != null ? !this.isPrototype.equals(that.isPrototype) : that.isPrototype != null) return false;
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
            int result = this.aggregationFunctions.hashCode();
            result = 31 * result + (this.descriptionExpression.hashCode());
            result = 31 * result + (this.enabled.hashCode());
            result = 31 * result + (this.entitySelectors.hashCode());
            result = 31 * result + (this.matchExpression.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.nameExpression.hashCode());
            result = 31 * result + (this.severityMapping.hashCode());
            result = 31 * result + (this.triggerExpression.hashCode());
            result = 31 * result + (this.windowSize.hashCode());
            result = 31 * result + (this.groupByEntity != null ? this.groupByEntity.hashCode() : 0);
            result = 31 * result + (this.groupByFields != null ? this.groupByFields.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.isPrototype != null ? this.isPrototype.hashCode() : 0);
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
