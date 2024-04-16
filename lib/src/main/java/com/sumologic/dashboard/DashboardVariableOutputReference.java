package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.881Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariableOutputReference")
public class DashboardVariableOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardVariableOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardVariableOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DashboardVariableOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putSourceDefinition(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putSourceDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllowMultiSelect() {
        software.amazon.jsii.Kernel.call(this, "resetAllowMultiSelect", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultValue() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultValue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDisplayName() {
        software.amazon.jsii.Kernel.call(this, "resetDisplayName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHideFromUi() {
        software.amazon.jsii.Kernel.call(this, "resetHideFromUi", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeAllOption() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeAllOption", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionOutputReference getSourceDefinition() {
        return software.amazon.jsii.Kernel.get(this, "sourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowMultiSelectInput() {
        return software.amazon.jsii.Kernel.get(this, "allowMultiSelectInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultValueInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultValueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDisplayNameInput() {
        return software.amazon.jsii.Kernel.get(this, "displayNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getHideFromUiInput() {
        return software.amazon.jsii.Kernel.get(this, "hideFromUiInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeAllOptionInput() {
        return software.amazon.jsii.Kernel.get(this, "includeAllOptionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinition getSourceDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceDefinitionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinition.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowMultiSelect() {
        return software.amazon.jsii.Kernel.get(this, "allowMultiSelect", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowMultiSelect(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowMultiSelect", java.util.Objects.requireNonNull(value, "allowMultiSelect is required"));
    }

    public void setAllowMultiSelect(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowMultiSelect", java.util.Objects.requireNonNull(value, "allowMultiSelect is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultValue() {
        return software.amazon.jsii.Kernel.get(this, "defaultValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultValue", java.util.Objects.requireNonNull(value, "defaultValue is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDisplayName() {
        return software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDisplayName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "displayName", java.util.Objects.requireNonNull(value, "displayName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getHideFromUi() {
        return software.amazon.jsii.Kernel.get(this, "hideFromUi", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setHideFromUi(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "hideFromUi", java.util.Objects.requireNonNull(value, "hideFromUi is required"));
    }

    public void setHideFromUi(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "hideFromUi", java.util.Objects.requireNonNull(value, "hideFromUi is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeAllOption() {
        return software.amazon.jsii.Kernel.get(this, "includeAllOption", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeAllOption(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeAllOption", java.util.Objects.requireNonNull(value, "includeAllOption is required"));
    }

    public void setIncludeAllOption(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeAllOption", java.util.Objects.requireNonNull(value, "includeAllOption is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
