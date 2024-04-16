package com.sumologic.lookup_table;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.095Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.lookupTable.LookupTableFields")
@software.amazon.jsii.Jsii.Proxy(LookupTableFields.Jsii$Proxy.class)
public interface LookupTableFields extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/lookup_table#field_name LookupTable#field_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFieldName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/lookup_table#field_type LookupTable#field_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFieldType();

    /**
     * @return a {@link Builder} of {@link LookupTableFields}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LookupTableFields}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LookupTableFields> {
        java.lang.String fieldName;
        java.lang.String fieldType;

        /**
         * Sets the value of {@link LookupTableFields#getFieldName}
         * @param fieldName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/lookup_table#field_name LookupTable#field_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder fieldName(java.lang.String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * Sets the value of {@link LookupTableFields#getFieldType}
         * @param fieldType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/lookup_table#field_type LookupTable#field_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder fieldType(java.lang.String fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LookupTableFields}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LookupTableFields build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LookupTableFields}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LookupTableFields {
        private final java.lang.String fieldName;
        private final java.lang.String fieldType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fieldName = software.amazon.jsii.Kernel.get(this, "fieldName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldType = software.amazon.jsii.Kernel.get(this, "fieldType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fieldName = java.util.Objects.requireNonNull(builder.fieldName, "fieldName is required");
            this.fieldType = java.util.Objects.requireNonNull(builder.fieldType, "fieldType is required");
        }

        @Override
        public final java.lang.String getFieldName() {
            return this.fieldName;
        }

        @Override
        public final java.lang.String getFieldType() {
            return this.fieldType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fieldName", om.valueToTree(this.getFieldName()));
            data.set("fieldType", om.valueToTree(this.getFieldType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.lookupTable.LookupTableFields"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LookupTableFields.Jsii$Proxy that = (LookupTableFields.Jsii$Proxy) o;

            if (!fieldName.equals(that.fieldName)) return false;
            return this.fieldType.equals(that.fieldType);
        }

        @Override
        public final int hashCode() {
            int result = this.fieldName.hashCode();
            result = 31 * result + (this.fieldType.hashCode());
            return result;
        }
    }
}
