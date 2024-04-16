package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.838Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboardOutputReference")
public class DashboardPanelSumoSearchPanelLinkedDashboardOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardPanelSumoSearchPanelLinkedDashboardOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardPanelSumoSearchPanelLinkedDashboardOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardPanelSumoSearchPanelLinkedDashboardOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetIncludeTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeVariables() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeVariables", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRelativePath() {
        software.amazon.jsii.Kernel.call(this, "resetRelativePath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "includeTimeRangeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeVariablesInput() {
        return software.amazon.jsii.Kernel.get(this, "includeVariablesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRelativePathInput() {
        return software.amazon.jsii.Kernel.get(this, "relativePathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "includeTimeRange", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeTimeRange(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeTimeRange", java.util.Objects.requireNonNull(value, "includeTimeRange is required"));
    }

    public void setIncludeTimeRange(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeTimeRange", java.util.Objects.requireNonNull(value, "includeTimeRange is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeVariables() {
        return software.amazon.jsii.Kernel.get(this, "includeVariables", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeVariables(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeVariables", java.util.Objects.requireNonNull(value, "includeVariables is required"));
    }

    public void setIncludeVariables(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeVariables", java.util.Objects.requireNonNull(value, "includeVariables is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRelativePath() {
        return software.amazon.jsii.Kernel.get(this, "relativePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRelativePath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "relativePath", java.util.Objects.requireNonNull(value, "relativePath is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanelLinkedDashboard value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
