package com.sumologic.cse_aggregation_rule;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule sumologic_cse_aggregation_rule}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.602Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseAggregationRule.CseAggregationRule")
public class CseAggregationRule extends com.hashicorp.cdktf.TerraformResource {

    protected CseAggregationRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseAggregationRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.cse_aggregation_rule.CseAggregationRule.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule sumologic_cse_aggregation_rule} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CseAggregationRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a CseAggregationRule resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseAggregationRule to import. This parameter is required.
     * @param importFromId The id of the existing CseAggregationRule that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the CseAggregationRule to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_aggregation_rule.CseAggregationRule.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a CseAggregationRule resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseAggregationRule to import. This parameter is required.
     * @param importFromId The id of the existing CseAggregationRule that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_aggregation_rule.CseAggregationRule.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putAggregationFunctions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctions>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctions> __cast_cd4240 = (java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctions>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctions __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putAggregationFunctions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEntitySelectors(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectors>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectors> __cast_cd4240 = (java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectors>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectors __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putEntitySelectors", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSeverityMapping(final @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping value) {
        software.amazon.jsii.Kernel.call(this, "putSeverityMapping", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGroupByEntity() {
        software.amazon.jsii.Kernel.call(this, "resetGroupByEntity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGroupByFields() {
        software.amazon.jsii.Kernel.call(this, "resetGroupByFields", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsPrototype() {
        software.amazon.jsii.Kernel.call(this, "resetIsPrototype", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSummaryExpression() {
        software.amazon.jsii.Kernel.call(this, "resetSummaryExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSuppressionWindowSize() {
        software.amazon.jsii.Kernel.call(this, "resetSuppressionWindowSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWindowSizeMillis() {
        software.amazon.jsii.Kernel.call(this, "resetWindowSizeMillis", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctionsList getAggregationFunctions() {
        return software.amazon.jsii.Kernel.get(this, "aggregationFunctions", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctionsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectorsList getEntitySelectors() {
        return software.amazon.jsii.Kernel.get(this, "entitySelectors", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectorsList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingOutputReference getSeverityMapping() {
        return software.amazon.jsii.Kernel.get(this, "severityMapping", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAggregationFunctionsInput() {
        return software.amazon.jsii.Kernel.get(this, "aggregationFunctionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEntitySelectorsInput() {
        return software.amazon.jsii.Kernel.get(this, "entitySelectorsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGroupByEntityInput() {
        return software.amazon.jsii.Kernel.get(this, "groupByEntityInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGroupByFieldsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "groupByFieldsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsPrototypeInput() {
        return software.amazon.jsii.Kernel.get(this, "isPrototypeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMatchExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "matchExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "nameExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping getSeverityMappingInput() {
        return software.amazon.jsii.Kernel.get(this, "severityMappingInput", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSummaryExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "summaryExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSuppressionWindowSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "suppressionWindowSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTriggerExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWindowSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "windowSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWindowSizeMillisInput() {
        return software.amazon.jsii.Kernel.get(this, "windowSizeMillisInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescriptionExpression() {
        return software.amazon.jsii.Kernel.get(this, "descriptionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescriptionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "descriptionExpression", java.util.Objects.requireNonNull(value, "descriptionExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getGroupByEntity() {
        return software.amazon.jsii.Kernel.get(this, "groupByEntity", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setGroupByEntity(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "groupByEntity", java.util.Objects.requireNonNull(value, "groupByEntity is required"));
    }

    public void setGroupByEntity(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "groupByEntity", java.util.Objects.requireNonNull(value, "groupByEntity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getGroupByFields() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "groupByFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setGroupByFields(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "groupByFields", java.util.Objects.requireNonNull(value, "groupByFields is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsPrototype() {
        return software.amazon.jsii.Kernel.get(this, "isPrototype", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsPrototype(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isPrototype", java.util.Objects.requireNonNull(value, "isPrototype is required"));
    }

    public void setIsPrototype(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isPrototype", java.util.Objects.requireNonNull(value, "isPrototype is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMatchExpression() {
        return software.amazon.jsii.Kernel.get(this, "matchExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMatchExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "matchExpression", java.util.Objects.requireNonNull(value, "matchExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNameExpression() {
        return software.amazon.jsii.Kernel.get(this, "nameExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNameExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "nameExpression", java.util.Objects.requireNonNull(value, "nameExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSummaryExpression() {
        return software.amazon.jsii.Kernel.get(this, "summaryExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSummaryExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "summaryExpression", java.util.Objects.requireNonNull(value, "summaryExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSuppressionWindowSize() {
        return software.amazon.jsii.Kernel.get(this, "suppressionWindowSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSuppressionWindowSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "suppressionWindowSize", java.util.Objects.requireNonNull(value, "suppressionWindowSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTags() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTriggerExpression() {
        return software.amazon.jsii.Kernel.get(this, "triggerExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTriggerExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "triggerExpression", java.util.Objects.requireNonNull(value, "triggerExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWindowSize() {
        return software.amazon.jsii.Kernel.get(this, "windowSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWindowSize(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "windowSize", java.util.Objects.requireNonNull(value, "windowSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWindowSizeMillis() {
        return software.amazon.jsii.Kernel.get(this, "windowSizeMillis", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWindowSizeMillis(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "windowSizeMillis", java.util.Objects.requireNonNull(value, "windowSizeMillis is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.cse_aggregation_rule.CseAggregationRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.cse_aggregation_rule.CseAggregationRule> {
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
        private final com.sumologic.cse_aggregation_rule.CseAggregationRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.cse_aggregation_rule.CseAggregationRuleConfig.Builder();
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
         * aggregation_functions block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#aggregation_functions CseAggregationRule#aggregation_functions}
         * <p>
         * @return {@code this}
         * @param aggregationFunctions aggregation_functions block. This parameter is required.
         */
        public Builder aggregationFunctions(final com.hashicorp.cdktf.IResolvable aggregationFunctions) {
            this.config.aggregationFunctions(aggregationFunctions);
            return this;
        }
        /**
         * aggregation_functions block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#aggregation_functions CseAggregationRule#aggregation_functions}
         * <p>
         * @return {@code this}
         * @param aggregationFunctions aggregation_functions block. This parameter is required.
         */
        public Builder aggregationFunctions(final java.util.List<? extends com.sumologic.cse_aggregation_rule.CseAggregationRuleAggregationFunctions> aggregationFunctions) {
            this.config.aggregationFunctions(aggregationFunctions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#description_expression CseAggregationRule#description_expression}.
         * <p>
         * @return {@code this}
         * @param descriptionExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#description_expression CseAggregationRule#description_expression}. This parameter is required.
         */
        public Builder descriptionExpression(final java.lang.String descriptionExpression) {
            this.config.descriptionExpression(descriptionExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#enabled CseAggregationRule#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * entity_selectors block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#entity_selectors CseAggregationRule#entity_selectors}
         * <p>
         * @return {@code this}
         * @param entitySelectors entity_selectors block. This parameter is required.
         */
        public Builder entitySelectors(final com.hashicorp.cdktf.IResolvable entitySelectors) {
            this.config.entitySelectors(entitySelectors);
            return this;
        }
        /**
         * entity_selectors block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#entity_selectors CseAggregationRule#entity_selectors}
         * <p>
         * @return {@code this}
         * @param entitySelectors entity_selectors block. This parameter is required.
         */
        public Builder entitySelectors(final java.util.List<? extends com.sumologic.cse_aggregation_rule.CseAggregationRuleEntitySelectors> entitySelectors) {
            this.config.entitySelectors(entitySelectors);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#match_expression CseAggregationRule#match_expression}.
         * <p>
         * @return {@code this}
         * @param matchExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#match_expression CseAggregationRule#match_expression}. This parameter is required.
         */
        public Builder matchExpression(final java.lang.String matchExpression) {
            this.config.matchExpression(matchExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name CseAggregationRule#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name CseAggregationRule#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name_expression CseAggregationRule#name_expression}.
         * <p>
         * @return {@code this}
         * @param nameExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#name_expression CseAggregationRule#name_expression}. This parameter is required.
         */
        public Builder nameExpression(final java.lang.String nameExpression) {
            this.config.nameExpression(nameExpression);
            return this;
        }

        /**
         * severity_mapping block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#severity_mapping CseAggregationRule#severity_mapping}
         * <p>
         * @return {@code this}
         * @param severityMapping severity_mapping block. This parameter is required.
         */
        public Builder severityMapping(final com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping severityMapping) {
            this.config.severityMapping(severityMapping);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#trigger_expression CseAggregationRule#trigger_expression}.
         * <p>
         * @return {@code this}
         * @param triggerExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#trigger_expression CseAggregationRule#trigger_expression}. This parameter is required.
         */
        public Builder triggerExpression(final java.lang.String triggerExpression) {
            this.config.triggerExpression(triggerExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size CseAggregationRule#window_size}.
         * <p>
         * @return {@code this}
         * @param windowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size CseAggregationRule#window_size}. This parameter is required.
         */
        public Builder windowSize(final java.lang.String windowSize) {
            this.config.windowSize(windowSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}.
         * <p>
         * @return {@code this}
         * @param groupByEntity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}. This parameter is required.
         */
        public Builder groupByEntity(final java.lang.Boolean groupByEntity) {
            this.config.groupByEntity(groupByEntity);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}.
         * <p>
         * @return {@code this}
         * @param groupByEntity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_entity CseAggregationRule#group_by_entity}. This parameter is required.
         */
        public Builder groupByEntity(final com.hashicorp.cdktf.IResolvable groupByEntity) {
            this.config.groupByEntity(groupByEntity);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_fields CseAggregationRule#group_by_fields}.
         * <p>
         * @return {@code this}
         * @param groupByFields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#group_by_fields CseAggregationRule#group_by_fields}. This parameter is required.
         */
        public Builder groupByFields(final java.util.List<java.lang.String> groupByFields) {
            this.config.groupByFields(groupByFields);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#id CseAggregationRule#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#id CseAggregationRule#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}.
         * <p>
         * @return {@code this}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}. This parameter is required.
         */
        public Builder isPrototype(final java.lang.Boolean isPrototype) {
            this.config.isPrototype(isPrototype);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}.
         * <p>
         * @return {@code this}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#is_prototype CseAggregationRule#is_prototype}. This parameter is required.
         */
        public Builder isPrototype(final com.hashicorp.cdktf.IResolvable isPrototype) {
            this.config.isPrototype(isPrototype);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#summary_expression CseAggregationRule#summary_expression}.
         * <p>
         * @return {@code this}
         * @param summaryExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#summary_expression CseAggregationRule#summary_expression}. This parameter is required.
         */
        public Builder summaryExpression(final java.lang.String summaryExpression) {
            this.config.summaryExpression(summaryExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#suppression_window_size CseAggregationRule#suppression_window_size}.
         * <p>
         * @return {@code this}
         * @param suppressionWindowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#suppression_window_size CseAggregationRule#suppression_window_size}. This parameter is required.
         */
        public Builder suppressionWindowSize(final java.lang.Number suppressionWindowSize) {
            this.config.suppressionWindowSize(suppressionWindowSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#tags CseAggregationRule#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#tags CseAggregationRule#tags}. This parameter is required.
         */
        public Builder tags(final java.util.List<java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size_millis CseAggregationRule#window_size_millis}.
         * <p>
         * @return {@code this}
         * @param windowSizeMillis Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_aggregation_rule#window_size_millis CseAggregationRule#window_size_millis}. This parameter is required.
         */
        public Builder windowSizeMillis(final java.lang.String windowSizeMillis) {
            this.config.windowSizeMillis(windowSizeMillis);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.cse_aggregation_rule.CseAggregationRule}.
         */
        @Override
        public com.sumologic.cse_aggregation_rule.CseAggregationRule build() {
            return new com.sumologic.cse_aggregation_rule.CseAggregationRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
