package com.sumologic.cse_log_mapping;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.749Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMappingFieldsOutputReference")
public class CseLogMappingFieldsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CseLogMappingFieldsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseLogMappingFieldsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public CseLogMappingFieldsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putLookup(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_log_mapping.CseLogMappingFieldsLookup>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_log_mapping.CseLogMappingFieldsLookup> __cast_cd4240 = (java.util.List<com.sumologic.cse_log_mapping.CseLogMappingFieldsLookup>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_log_mapping.CseLogMappingFieldsLookup __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putLookup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAlternateValues() {
        software.amazon.jsii.Kernel.call(this, "resetAlternateValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCaseInsensitive() {
        software.amazon.jsii.Kernel.call(this, "resetCaseInsensitive", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultValue() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultValue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFieldJoin() {
        software.amazon.jsii.Kernel.call(this, "resetFieldJoin", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFormat() {
        software.amazon.jsii.Kernel.call(this, "resetFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFormatParameters() {
        software.amazon.jsii.Kernel.call(this, "resetFormatParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetJoinDelimiter() {
        software.amazon.jsii.Kernel.call(this, "resetJoinDelimiter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLookup() {
        software.amazon.jsii.Kernel.call(this, "resetLookup", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkippedValues() {
        software.amazon.jsii.Kernel.call(this, "resetSkippedValues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSplitDelimiter() {
        software.amazon.jsii.Kernel.call(this, "resetSplitDelimiter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSplitIndex() {
        software.amazon.jsii.Kernel.call(this, "resetSplitIndex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeZone() {
        software.amazon.jsii.Kernel.call(this, "resetTimeZone", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValue() {
        software.amazon.jsii.Kernel.call(this, "resetValue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValueType() {
        software.amazon.jsii.Kernel.call(this, "resetValueType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_log_mapping.CseLogMappingFieldsLookupList getLookup() {
        return software.amazon.jsii.Kernel.get(this, "lookup", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingFieldsLookupList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAlternateValuesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "alternateValuesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCaseInsensitiveInput() {
        return software.amazon.jsii.Kernel.get(this, "caseInsensitiveInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultValueInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultValueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFieldJoinInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "fieldJoinInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "formatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFormatParametersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "formatParametersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getJoinDelimiterInput() {
        return software.amazon.jsii.Kernel.get(this, "joinDelimiterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLookupInput() {
        return software.amazon.jsii.Kernel.get(this, "lookupInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSkippedValuesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "skippedValuesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSplitDelimiterInput() {
        return software.amazon.jsii.Kernel.get(this, "splitDelimiterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSplitIndexInput() {
        return software.amazon.jsii.Kernel.get(this, "splitIndexInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "timeZoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValueInput() {
        return software.amazon.jsii.Kernel.get(this, "valueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValueTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "valueTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAlternateValues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "alternateValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAlternateValues(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "alternateValues", java.util.Objects.requireNonNull(value, "alternateValues is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCaseInsensitive() {
        return software.amazon.jsii.Kernel.get(this, "caseInsensitive", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCaseInsensitive(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "caseInsensitive", java.util.Objects.requireNonNull(value, "caseInsensitive is required"));
    }

    public void setCaseInsensitive(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "caseInsensitive", java.util.Objects.requireNonNull(value, "caseInsensitive is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultValue() {
        return software.amazon.jsii.Kernel.get(this, "defaultValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultValue", java.util.Objects.requireNonNull(value, "defaultValue is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getFieldJoin() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "fieldJoin", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setFieldJoin(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "fieldJoin", java.util.Objects.requireNonNull(value, "fieldJoin is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFormat() {
        return software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "format", java.util.Objects.requireNonNull(value, "format is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getFormatParameters() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "formatParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setFormatParameters(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "formatParameters", java.util.Objects.requireNonNull(value, "formatParameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getJoinDelimiter() {
        return software.amazon.jsii.Kernel.get(this, "joinDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setJoinDelimiter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "joinDelimiter", java.util.Objects.requireNonNull(value, "joinDelimiter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSkippedValues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "skippedValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSkippedValues(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "skippedValues", java.util.Objects.requireNonNull(value, "skippedValues is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSplitDelimiter() {
        return software.amazon.jsii.Kernel.get(this, "splitDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSplitDelimiter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "splitDelimiter", java.util.Objects.requireNonNull(value, "splitDelimiter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSplitIndex() {
        return software.amazon.jsii.Kernel.get(this, "splitIndex", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSplitIndex(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "splitIndex", java.util.Objects.requireNonNull(value, "splitIndex is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeZone() {
        return software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeZone", java.util.Objects.requireNonNull(value, "timeZone is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "value", java.util.Objects.requireNonNull(value, "value is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValueType() {
        return software.amazon.jsii.Kernel.get(this, "valueType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValueType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "valueType", java.util.Objects.requireNonNull(value, "valueType is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.cse_log_mapping.CseLogMappingFields value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
