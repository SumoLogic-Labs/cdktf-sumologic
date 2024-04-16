package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.209Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorOutputReference")
public class SloIndicatorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SloIndicatorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SloIndicatorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SloIndicatorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMonitorBasedEvaluation(final @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorMonitorBasedEvaluation value) {
        software.amazon.jsii.Kernel.call(this, "putMonitorBasedEvaluation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRequestBasedEvaluation(final @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorRequestBasedEvaluation value) {
        software.amazon.jsii.Kernel.call(this, "putRequestBasedEvaluation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWindowBasedEvaluation(final @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorWindowBasedEvaluation value) {
        software.amazon.jsii.Kernel.call(this, "putWindowBasedEvaluation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMonitorBasedEvaluation() {
        software.amazon.jsii.Kernel.call(this, "resetMonitorBasedEvaluation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequestBasedEvaluation() {
        software.amazon.jsii.Kernel.call(this, "resetRequestBasedEvaluation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWindowBasedEvaluation() {
        software.amazon.jsii.Kernel.call(this, "resetWindowBasedEvaluation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorMonitorBasedEvaluationOutputReference getMonitorBasedEvaluation() {
        return software.amazon.jsii.Kernel.get(this, "monitorBasedEvaluation", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorRequestBasedEvaluationOutputReference getRequestBasedEvaluation() {
        return software.amazon.jsii.Kernel.get(this, "requestBasedEvaluation", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorRequestBasedEvaluationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorWindowBasedEvaluationOutputReference getWindowBasedEvaluation() {
        return software.amazon.jsii.Kernel.get(this, "windowBasedEvaluation", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorWindowBasedEvaluationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluation getMonitorBasedEvaluationInput() {
        return software.amazon.jsii.Kernel.get(this, "monitorBasedEvaluationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluation.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorRequestBasedEvaluation getRequestBasedEvaluationInput() {
        return software.amazon.jsii.Kernel.get(this, "requestBasedEvaluationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorRequestBasedEvaluation.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorWindowBasedEvaluation getWindowBasedEvaluationInput() {
        return software.amazon.jsii.Kernel.get(this, "windowBasedEvaluationInput", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorWindowBasedEvaluation.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicator getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicator.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicator value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
