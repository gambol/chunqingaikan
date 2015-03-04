package com.j256.ormlite.field.types; class BaseDateType { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/field/types/BaseDateType;
a=0;// .super Lcom/j256/ormlite/field/types/BaseDataType;
a=0;// .source "BaseDateType.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;//     .locals 0
a=0;//     .param p1, "sqlType"    # Lcom/j256/ormlite/field/SqlType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/field/SqlType;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/BaseDateType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static convertDateStringConfig(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;)Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     .locals 1
a=0;//     .param p0, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p1, "defaultDateFormatConfig"    # Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 32
a=0;//     .end local p1    # "defaultDateFormatConfig":Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 28
a=0;//     .restart local p1    # "defaultDateFormatConfig":Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/field/FieldType;->getDataTypeConfigObj()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "configObj":Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 32
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static normalizeDateString(Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "formatConfig"    # Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     .param p1, "dateStr"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/text/ParseException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;->getDateFormat()Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 44
a=0;//     .local v1, "dateFormat":Ljava/text/DateFormat;
a=0;//     #v1=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {v1, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "date":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method protected static parseDateString(Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;Ljava/lang/String;)Ljava/util/Date;
a=0;//     .locals 2
a=0;//     .param p0, "formatConfig"    # Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     .param p1, "dateStr"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/text/ParseException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;->getDateFormat()Ljava/text/DateFormat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "dateFormat":Ljava/text/DateFormat;
a=0;//     #v0=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isValidForField(Ljava/lang/reflect/Field;)Z
a=0;//     .locals 2
a=0;//     .param p1, "field"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isValidForVersion()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "currentValue"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 76
a=0;//     .local v0, "newVal":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     .line 81
a=0;//     .end local p1    # "currentValue":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Date;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 78
a=0;//     .restart local p1    # "currentValue":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     check-cast p1, Ljava/util/Date;
a=0;// 
a=0;//     .end local p1    # "currentValue":Ljava/lang/Object;
a=0;//     invoke-virtual {p1}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     const-wide/16 v3, 0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v3, v0
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v2=(Byte);v3=(LongHi);v4=(Uninit);
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     goto :goto_0
a=0;// .end method
}}
