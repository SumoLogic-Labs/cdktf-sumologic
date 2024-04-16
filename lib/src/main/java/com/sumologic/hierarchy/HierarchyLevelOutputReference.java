package com.sumologic.hierarchy;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.015Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.hierarchy.HierarchyLevelOutputReference")
public class HierarchyLevelOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected HierarchyLevelOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HierarchyLevelOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public HierarchyLevelOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putNextLevel(final @org.jetbrains.annotations.NotNull com.sumologic.hierarchy.HierarchyLevelNextLevel value) {
        software.amazon.jsii.Kernel.call(this, "putNextLevel", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNextLevelsWithConditions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.hierarchy.HierarchyLevelNextLevelsWithConditions>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.hierarchy.HierarchyLevelNextLevelsWithConditions> __cast_cd4240 = (java.util.List<com.sumologic.hierarchy.HierarchyLevelNextLevelsWithConditions>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.hierarchy.HierarchyLevelNextLevelsWithConditions __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putNextLevelsWithConditions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetNextLevel() {
        software.amazon.jsii.Kernel.call(this, "resetNextLevel", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNextLevelsWithConditions() {
        software.amazon.jsii.Kernel.call(this, "resetNextLevelsWithConditions", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.hierarchy.HierarchyLevelNextLevelOutputReference getNextLevel() {
        return software.amazon.jsii.Kernel.get(this, "nextLevel", software.amazon.jsii.NativeType.forClass(com.sumologic.hierarchy.HierarchyLevelNextLevelOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.hierarchy.HierarchyLevelNextLevelsWithConditionsList getNextLevelsWithConditions() {
        return software.amazon.jsii.Kernel.get(this, "nextLevelsWithConditions", software.amazon.jsii.NativeType.forClass(com.sumologic.hierarchy.HierarchyLevelNextLevelsWithConditionsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEntityTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "entityTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.hierarchy.HierarchyLevelNextLevel getNextLevelInput() {
        return software.amazon.jsii.Kernel.get(this, "nextLevelInput", software.amazon.jsii.NativeType.forClass(com.sumologic.hierarchy.HierarchyLevelNextLevel.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNextLevelsWithConditionsInput() {
        return software.amazon.jsii.Kernel.get(this, "nextLevelsWithConditionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEntityType() {
        return software.amazon.jsii.Kernel.get(this, "entityType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEntityType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "entityType", java.util.Objects.requireNonNull(value, "entityType is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.hierarchy.HierarchyLevel value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
