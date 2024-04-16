package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.116Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorObjPermission")
@software.amazon.jsii.Jsii.Proxy(MonitorObjPermission.Jsii$Proxy.class)
public interface MonitorObjPermission extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#permissions Monitor#permissions}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPermissions();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#subject_id Monitor#subject_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSubjectId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#subject_type Monitor#subject_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSubjectType();

    /**
     * @return a {@link Builder} of {@link MonitorObjPermission}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorObjPermission}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorObjPermission> {
        java.util.List<java.lang.String> permissions;
        java.lang.String subjectId;
        java.lang.String subjectType;

        /**
         * Sets the value of {@link MonitorObjPermission#getPermissions}
         * @param permissions Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#permissions Monitor#permissions}. This parameter is required.
         * @return {@code this}
         */
        public Builder permissions(java.util.List<java.lang.String> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Sets the value of {@link MonitorObjPermission#getSubjectId}
         * @param subjectId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#subject_id Monitor#subject_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder subjectId(java.lang.String subjectId) {
            this.subjectId = subjectId;
            return this;
        }

        /**
         * Sets the value of {@link MonitorObjPermission#getSubjectType}
         * @param subjectType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#subject_type Monitor#subject_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder subjectType(java.lang.String subjectType) {
            this.subjectType = subjectType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorObjPermission}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorObjPermission build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorObjPermission}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorObjPermission {
        private final java.util.List<java.lang.String> permissions;
        private final java.lang.String subjectId;
        private final java.lang.String subjectType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.permissions = software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.subjectId = software.amazon.jsii.Kernel.get(this, "subjectId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subjectType = software.amazon.jsii.Kernel.get(this, "subjectType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.permissions = java.util.Objects.requireNonNull(builder.permissions, "permissions is required");
            this.subjectId = java.util.Objects.requireNonNull(builder.subjectId, "subjectId is required");
            this.subjectType = java.util.Objects.requireNonNull(builder.subjectType, "subjectType is required");
        }

        @Override
        public final java.util.List<java.lang.String> getPermissions() {
            return this.permissions;
        }

        @Override
        public final java.lang.String getSubjectId() {
            return this.subjectId;
        }

        @Override
        public final java.lang.String getSubjectType() {
            return this.subjectType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("permissions", om.valueToTree(this.getPermissions()));
            data.set("subjectId", om.valueToTree(this.getSubjectId()));
            data.set("subjectType", om.valueToTree(this.getSubjectType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorObjPermission"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorObjPermission.Jsii$Proxy that = (MonitorObjPermission.Jsii$Proxy) o;

            if (!permissions.equals(that.permissions)) return false;
            if (!subjectId.equals(that.subjectId)) return false;
            return this.subjectType.equals(that.subjectType);
        }

        @Override
        public final int hashCode() {
            int result = this.permissions.hashCode();
            result = 31 * result + (this.subjectId.hashCode());
            result = 31 * result + (this.subjectType.hashCode());
            return result;
        }
    }
}
