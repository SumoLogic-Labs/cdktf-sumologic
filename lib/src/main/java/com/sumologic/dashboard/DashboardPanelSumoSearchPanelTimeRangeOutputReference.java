package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.859Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeOutputReference")
public class DashboardPanelSumoSearchPanelTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardPanelSumoSearchPanelTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardPanelSumoSearchPanelTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardPanelSumoSearchPanelTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBeginBoundedTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCompleteLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeCompleteLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBeginBoundedTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompleteLiteralTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeOutputReference getBeginBoundedTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeCompleteLiteralTimeRangeOutputReference getCompleteLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeCompleteLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange getBeginBoundedTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeBeginBoundedTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeCompleteLiteralTimeRange getCompleteLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRangeCompleteLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
