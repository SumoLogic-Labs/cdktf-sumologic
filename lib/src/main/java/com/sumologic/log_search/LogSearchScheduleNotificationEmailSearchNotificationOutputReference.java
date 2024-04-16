package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.073Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationEmailSearchNotificationOutputReference")
public class LogSearchScheduleNotificationEmailSearchNotificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchScheduleNotificationEmailSearchNotificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchScheduleNotificationEmailSearchNotificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchScheduleNotificationEmailSearchNotificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetIncludeCsvAttachment() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeCsvAttachment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeHistogram() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeHistogram", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeQuery() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeQuery", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeResultSet() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeResultSet", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubjectTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetSubjectTemplate", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeCsvAttachmentInput() {
        return software.amazon.jsii.Kernel.get(this, "includeCsvAttachmentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeHistogramInput() {
        return software.amazon.jsii.Kernel.get(this, "includeHistogramInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeQueryInput() {
        return software.amazon.jsii.Kernel.get(this, "includeQueryInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeResultSetInput() {
        return software.amazon.jsii.Kernel.get(this, "includeResultSetInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubjectTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "subjectTemplateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getToListInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "toListInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeCsvAttachment() {
        return software.amazon.jsii.Kernel.get(this, "includeCsvAttachment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeCsvAttachment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeCsvAttachment", java.util.Objects.requireNonNull(value, "includeCsvAttachment is required"));
    }

    public void setIncludeCsvAttachment(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeCsvAttachment", java.util.Objects.requireNonNull(value, "includeCsvAttachment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeHistogram() {
        return software.amazon.jsii.Kernel.get(this, "includeHistogram", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeHistogram(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeHistogram", java.util.Objects.requireNonNull(value, "includeHistogram is required"));
    }

    public void setIncludeHistogram(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeHistogram", java.util.Objects.requireNonNull(value, "includeHistogram is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeQuery() {
        return software.amazon.jsii.Kernel.get(this, "includeQuery", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeQuery(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeQuery", java.util.Objects.requireNonNull(value, "includeQuery is required"));
    }

    public void setIncludeQuery(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeQuery", java.util.Objects.requireNonNull(value, "includeQuery is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeResultSet() {
        return software.amazon.jsii.Kernel.get(this, "includeResultSet", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeResultSet(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeResultSet", java.util.Objects.requireNonNull(value, "includeResultSet is required"));
    }

    public void setIncludeResultSet(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeResultSet", java.util.Objects.requireNonNull(value, "includeResultSet is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubjectTemplate() {
        return software.amazon.jsii.Kernel.get(this, "subjectTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubjectTemplate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subjectTemplate", java.util.Objects.requireNonNull(value, "subjectTemplate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getToList() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "toList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setToList(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "toList", java.util.Objects.requireNonNull(value, "toList is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
