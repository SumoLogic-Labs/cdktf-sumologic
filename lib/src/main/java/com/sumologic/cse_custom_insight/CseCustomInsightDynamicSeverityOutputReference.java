package com.sumologic.cse_custom_insight;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.670Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseCustomInsight.CseCustomInsightDynamicSeverityOutputReference")
public class CseCustomInsightDynamicSeverityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CseCustomInsightDynamicSeverityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseCustomInsightDynamicSeverityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CseCustomInsightDynamicSeverityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInsightSeverityInput() {
        return software.amazon.jsii.Kernel.get(this, "insightSeverityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinimumSignalSeverityInput() {
        return software.amazon.jsii.Kernel.get(this, "minimumSignalSeverityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInsightSeverity() {
        return software.amazon.jsii.Kernel.get(this, "insightSeverity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInsightSeverity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "insightSeverity", java.util.Objects.requireNonNull(value, "insightSeverity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinimumSignalSeverity() {
        return software.amazon.jsii.Kernel.get(this, "minimumSignalSeverity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinimumSignalSeverity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minimumSignalSeverity", java.util.Objects.requireNonNull(value, "minimumSignalSeverity is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.cse_custom_insight.CseCustomInsightDynamicSeverity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
