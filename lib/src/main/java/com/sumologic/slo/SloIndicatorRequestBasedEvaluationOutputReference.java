package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.210Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorRequestBasedEvaluationOutputReference")
public class SloIndicatorRequestBasedEvaluationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SloIndicatorRequestBasedEvaluationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SloIndicatorRequestBasedEvaluationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SloIndicatorRequestBasedEvaluationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putQueries(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueries>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueries> __cast_cd4240 = (java.util.List<com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueries>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueries __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putQueries", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOp() {
        software.amazon.jsii.Kernel.call(this, "resetOp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueriesList getQueries() {
        return software.amazon.jsii.Kernel.get(this, "queries", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueriesList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOpInput() {
        return software.amazon.jsii.Kernel.get(this, "opInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getQueriesInput() {
        return software.amazon.jsii.Kernel.get(this, "queriesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQueryTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "queryTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOp() {
        return software.amazon.jsii.Kernel.get(this, "op", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "op", java.util.Objects.requireNonNull(value, "op is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQueryType() {
        return software.amazon.jsii.Kernel.get(this, "queryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQueryType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "queryType", java.util.Objects.requireNonNull(value, "queryType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getThreshold() {
        return software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "threshold", java.util.Objects.requireNonNull(value, "threshold is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorRequestBasedEvaluation getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorRequestBasedEvaluation.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorRequestBasedEvaluation value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
