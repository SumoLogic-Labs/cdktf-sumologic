package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.092Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchTimeRangeBeginBoundedTimeRangeOutputReference")
public class LogSearchTimeRangeBeginBoundedTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LogSearchTimeRangeBeginBoundedTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LogSearchTimeRangeBeginBoundedTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LogSearchTimeRangeBeginBoundedTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFrom(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFrom value) {
        software.amazon.jsii.Kernel.call(this, "putFrom", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTo(final @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeTo value) {
        software.amazon.jsii.Kernel.call(this, "putTo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTo() {
        software.amazon.jsii.Kernel.call(this, "resetTo", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference getFrom() {
        return software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFromOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeToOutputReference getTo() {
        return software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeToOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFrom getFromInput() {
        return software.amazon.jsii.Kernel.get(this, "fromInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeFrom.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeTo getToInput() {
        return software.amazon.jsii.Kernel.get(this, "toInput", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRangeTo.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchTimeRangeBeginBoundedTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
