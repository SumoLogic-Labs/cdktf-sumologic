package com.sumologic.cse_outlier_rule;

/**
 * Represents a {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule sumologic_cse_outlier_rule}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.769Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseOutlierRule.CseOutlierRule")
public class CseOutlierRule extends com.hashicorp.cdktf.TerraformResource {

    protected CseOutlierRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseOutlierRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(com.sumologic.cse_outlier_rule.CseOutlierRule.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule sumologic_cse_outlier_rule} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CseOutlierRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull com.sumologic.cse_outlier_rule.CseOutlierRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    /**
     * Generates CDKTF code for importing a CseOutlierRule resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseOutlierRule to import. This parameter is required.
     * @param importFromId The id of the existing CseOutlierRule that should be imported. This parameter is required.
     * @param provider ? Optional instance of the provider where the CseOutlierRule to import is found.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId, final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.TerraformProvider provider) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_outlier_rule.CseOutlierRule.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required"), provider });
    }

    /**
     * Generates CDKTF code for importing a CseOutlierRule resource upon running "cdktf plan <stack-name>".
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param importToId The construct id used in the generated config for the CseOutlierRule to import. This parameter is required.
     * @param importFromId The id of the existing CseOutlierRule that should be imported. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.ImportableResource generateConfigForImport(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String importToId, final @org.jetbrains.annotations.NotNull java.lang.String importFromId) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(com.sumologic.cse_outlier_rule.CseOutlierRule.class, "generateConfigForImport", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ImportableResource.class), new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(importToId, "importToId is required"), java.util.Objects.requireNonNull(importFromId, "importFromId is required") });
    }

    public void putAggregationFunctions(final @org.jetbrains.annotations.NotNull com.sumologic.cse_outlier_rule.CseOutlierRuleAggregationFunctions value) {
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
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectors>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectors> __cast_cd4240 = (java.util.List<com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectors>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectors __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putEntitySelectors", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
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

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_outlier_rule.CseOutlierRuleAggregationFunctionsOutputReference getAggregationFunctions() {
        return software.amazon.jsii.Kernel.get(this, "aggregationFunctions", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_outlier_rule.CseOutlierRuleAggregationFunctionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectorsList getEntitySelectors() {
        return software.amazon.jsii.Kernel.get(this, "entitySelectors", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectorsList.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.cse_outlier_rule.CseOutlierRuleAggregationFunctions getAggregationFunctionsInput() {
        return software.amazon.jsii.Kernel.get(this, "aggregationFunctionsInput", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_outlier_rule.CseOutlierRuleAggregationFunctions.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBaselineWindowSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "baselineWindowSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeviationThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "deviationThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEntitySelectorsInput() {
        return software.amazon.jsii.Kernel.get(this, "entitySelectorsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getFloorValueInput() {
        return software.amazon.jsii.Kernel.get(this, "floorValueInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getRetentionWindowSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "retentionWindowSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSeverityInput() {
        return software.amazon.jsii.Kernel.get(this, "severityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getWindowSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "windowSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBaselineWindowSize() {
        return software.amazon.jsii.Kernel.get(this, "baselineWindowSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBaselineWindowSize(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "baselineWindowSize", java.util.Objects.requireNonNull(value, "baselineWindowSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescriptionExpression() {
        return software.amazon.jsii.Kernel.get(this, "descriptionExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescriptionExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "descriptionExpression", java.util.Objects.requireNonNull(value, "descriptionExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeviationThreshold() {
        return software.amazon.jsii.Kernel.get(this, "deviationThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeviationThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deviationThreshold", java.util.Objects.requireNonNull(value, "deviationThreshold is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Number getFloorValue() {
        return software.amazon.jsii.Kernel.get(this, "floorValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setFloorValue(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "floorValue", java.util.Objects.requireNonNull(value, "floorValue is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRetentionWindowSize() {
        return software.amazon.jsii.Kernel.get(this, "retentionWindowSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRetentionWindowSize(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "retentionWindowSize", java.util.Objects.requireNonNull(value, "retentionWindowSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSeverity() {
        return software.amazon.jsii.Kernel.get(this, "severity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSeverity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "severity", java.util.Objects.requireNonNull(value, "severity is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getWindowSize() {
        return software.amazon.jsii.Kernel.get(this, "windowSize", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWindowSize(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "windowSize", java.util.Objects.requireNonNull(value, "windowSize is required"));
    }

    /**
     * A fluent builder for {@link com.sumologic.cse_outlier_rule.CseOutlierRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<com.sumologic.cse_outlier_rule.CseOutlierRule> {
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
        private final com.sumologic.cse_outlier_rule.CseOutlierRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new com.sumologic.cse_outlier_rule.CseOutlierRuleConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#aggregation_functions CseOutlierRule#aggregation_functions}
         * <p>
         * @return {@code this}
         * @param aggregationFunctions aggregation_functions block. This parameter is required.
         */
        public Builder aggregationFunctions(final com.sumologic.cse_outlier_rule.CseOutlierRuleAggregationFunctions aggregationFunctions) {
            this.config.aggregationFunctions(aggregationFunctions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#baseline_window_size CseOutlierRule#baseline_window_size}.
         * <p>
         * @return {@code this}
         * @param baselineWindowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#baseline_window_size CseOutlierRule#baseline_window_size}. This parameter is required.
         */
        public Builder baselineWindowSize(final java.lang.String baselineWindowSize) {
            this.config.baselineWindowSize(baselineWindowSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#description_expression CseOutlierRule#description_expression}.
         * <p>
         * @return {@code this}
         * @param descriptionExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#description_expression CseOutlierRule#description_expression}. This parameter is required.
         */
        public Builder descriptionExpression(final java.lang.String descriptionExpression) {
            this.config.descriptionExpression(descriptionExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#deviation_threshold CseOutlierRule#deviation_threshold}.
         * <p>
         * @return {@code this}
         * @param deviationThreshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#deviation_threshold CseOutlierRule#deviation_threshold}. This parameter is required.
         */
        public Builder deviationThreshold(final java.lang.Number deviationThreshold) {
            this.config.deviationThreshold(deviationThreshold);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#enabled CseOutlierRule#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#enabled CseOutlierRule#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#enabled CseOutlierRule#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#enabled CseOutlierRule#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * entity_selectors block.
         * <p>
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#entity_selectors CseOutlierRule#entity_selectors}
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
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#entity_selectors CseOutlierRule#entity_selectors}
         * <p>
         * @return {@code this}
         * @param entitySelectors entity_selectors block. This parameter is required.
         */
        public Builder entitySelectors(final java.util.List<? extends com.sumologic.cse_outlier_rule.CseOutlierRuleEntitySelectors> entitySelectors) {
            this.config.entitySelectors(entitySelectors);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#floor_value CseOutlierRule#floor_value}.
         * <p>
         * @return {@code this}
         * @param floorValue Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#floor_value CseOutlierRule#floor_value}. This parameter is required.
         */
        public Builder floorValue(final java.lang.Number floorValue) {
            this.config.floorValue(floorValue);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#match_expression CseOutlierRule#match_expression}.
         * <p>
         * @return {@code this}
         * @param matchExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#match_expression CseOutlierRule#match_expression}. This parameter is required.
         */
        public Builder matchExpression(final java.lang.String matchExpression) {
            this.config.matchExpression(matchExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#name CseOutlierRule#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#name CseOutlierRule#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#name_expression CseOutlierRule#name_expression}.
         * <p>
         * @return {@code this}
         * @param nameExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#name_expression CseOutlierRule#name_expression}. This parameter is required.
         */
        public Builder nameExpression(final java.lang.String nameExpression) {
            this.config.nameExpression(nameExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#retention_window_size CseOutlierRule#retention_window_size}.
         * <p>
         * @return {@code this}
         * @param retentionWindowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#retention_window_size CseOutlierRule#retention_window_size}. This parameter is required.
         */
        public Builder retentionWindowSize(final java.lang.String retentionWindowSize) {
            this.config.retentionWindowSize(retentionWindowSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#severity CseOutlierRule#severity}.
         * <p>
         * @return {@code this}
         * @param severity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#severity CseOutlierRule#severity}. This parameter is required.
         */
        public Builder severity(final java.lang.Number severity) {
            this.config.severity(severity);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#window_size CseOutlierRule#window_size}.
         * <p>
         * @return {@code this}
         * @param windowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#window_size CseOutlierRule#window_size}. This parameter is required.
         */
        public Builder windowSize(final java.lang.String windowSize) {
            this.config.windowSize(windowSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#group_by_fields CseOutlierRule#group_by_fields}.
         * <p>
         * @return {@code this}
         * @param groupByFields Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#group_by_fields CseOutlierRule#group_by_fields}. This parameter is required.
         */
        public Builder groupByFields(final java.util.List<java.lang.String> groupByFields) {
            this.config.groupByFields(groupByFields);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#id CseOutlierRule#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#id CseOutlierRule#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#is_prototype CseOutlierRule#is_prototype}.
         * <p>
         * @return {@code this}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#is_prototype CseOutlierRule#is_prototype}. This parameter is required.
         */
        public Builder isPrototype(final java.lang.Boolean isPrototype) {
            this.config.isPrototype(isPrototype);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#is_prototype CseOutlierRule#is_prototype}.
         * <p>
         * @return {@code this}
         * @param isPrototype Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#is_prototype CseOutlierRule#is_prototype}. This parameter is required.
         */
        public Builder isPrototype(final com.hashicorp.cdktf.IResolvable isPrototype) {
            this.config.isPrototype(isPrototype);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#summary_expression CseOutlierRule#summary_expression}.
         * <p>
         * @return {@code this}
         * @param summaryExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#summary_expression CseOutlierRule#summary_expression}. This parameter is required.
         */
        public Builder summaryExpression(final java.lang.String summaryExpression) {
            this.config.summaryExpression(summaryExpression);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#suppression_window_size CseOutlierRule#suppression_window_size}.
         * <p>
         * @return {@code this}
         * @param suppressionWindowSize Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#suppression_window_size CseOutlierRule#suppression_window_size}. This parameter is required.
         */
        public Builder suppressionWindowSize(final java.lang.Number suppressionWindowSize) {
            this.config.suppressionWindowSize(suppressionWindowSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#tags CseOutlierRule#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_outlier_rule#tags CseOutlierRule#tags}. This parameter is required.
         */
        public Builder tags(final java.util.List<java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * @return a newly built instance of {@link com.sumologic.cse_outlier_rule.CseOutlierRule}.
         */
        @Override
        public com.sumologic.cse_outlier_rule.CseOutlierRule build() {
            return new com.sumologic.cse_outlier_rule.CseOutlierRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
