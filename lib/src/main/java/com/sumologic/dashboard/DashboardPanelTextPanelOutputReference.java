package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.860Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelTextPanelOutputReference")
public class DashboardPanelTextPanelOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardPanelTextPanelOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardPanelTextPanelOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardPanelTextPanelOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetKeepVisualSettingsConsistentWithParent() {
        software.amazon.jsii.Kernel.call(this, "resetKeepVisualSettingsConsistentWithParent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetText() {
        software.amazon.jsii.Kernel.call(this, "resetText", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTitle() {
        software.amazon.jsii.Kernel.call(this, "resetTitle", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVisualSettings() {
        software.amazon.jsii.Kernel.call(this, "resetVisualSettings", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getKeepVisualSettingsConsistentWithParentInput() {
        return software.amazon.jsii.Kernel.get(this, "keepVisualSettingsConsistentWithParentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "keyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTextInput() {
        return software.amazon.jsii.Kernel.get(this, "textInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTitleInput() {
        return software.amazon.jsii.Kernel.get(this, "titleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVisualSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "visualSettingsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getKeepVisualSettingsConsistentWithParent() {
        return software.amazon.jsii.Kernel.get(this, "keepVisualSettingsConsistentWithParent", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setKeepVisualSettingsConsistentWithParent(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "keepVisualSettingsConsistentWithParent", java.util.Objects.requireNonNull(value, "keepVisualSettingsConsistentWithParent is required"));
    }

    public void setKeepVisualSettingsConsistentWithParent(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "keepVisualSettingsConsistentWithParent", java.util.Objects.requireNonNull(value, "keepVisualSettingsConsistentWithParent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKey() {
        return software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "key", java.util.Objects.requireNonNull(value, "key is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getText() {
        return software.amazon.jsii.Kernel.get(this, "text", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setText(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "text", java.util.Objects.requireNonNull(value, "text is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTitle() {
        return software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTitle(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "title", java.util.Objects.requireNonNull(value, "title is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVisualSettings() {
        return software.amazon.jsii.Kernel.get(this, "visualSettings", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVisualSettings(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "visualSettings", java.util.Objects.requireNonNull(value, "visualSettings is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelTextPanel getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardPanelTextPanel.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardPanelTextPanel value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
