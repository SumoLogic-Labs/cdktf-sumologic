package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.857Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference")
public class DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRangeNameInput() {
        return software.amazon.jsii.Kernel.get(this, "rangeNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRangeName() {
        return software.amazon.jsii.Kernel.get(this, "rangeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRangeName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rangeName", java.util.Objects.requireNonNull(value, "rangeName is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeToLiteralTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}