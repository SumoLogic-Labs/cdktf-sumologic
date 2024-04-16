package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.826Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelOutputReference")
public class DashboardPanelOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardPanelOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardPanelOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DashboardPanelOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putSumoSearchPanel(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanel value) {
        software.amazon.jsii.Kernel.call(this, "putSumoSearchPanel", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTextPanel(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelTextPanel value) {
        software.amazon.jsii.Kernel.call(this, "putTextPanel", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSumoSearchPanel() {
        software.amazon.jsii.Kernel.call(this, "resetSumoSearchPanel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTextPanel() {
        software.amazon.jsii.Kernel.call(this, "resetTextPanel", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelSumoSearchPanelOutputReference getSumoSearchPanel() {
        return software.amazon.jsii.Kernel.get(this, "sumoSearchPanel", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanelOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardPanelTextPanelOutputReference getTextPanel() {
        return software.amazon.jsii.Kernel.get(this, "textPanel", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelTextPanelOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelSumoSearchPanel getSumoSearchPanelInput() {
        return software.amazon.jsii.Kernel.get(this, "sumoSearchPanelInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelSumoSearchPanel.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelTextPanel getTextPanelInput() {
        return software.amazon.jsii.Kernel.get(this, "textPanelInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelTextPanel.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanel value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
