package com.j256.ormlite.field.types; class SqlDateType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/SqlDateType;
a=0;// .super Lcom/j256/ormlite/field/types/DateType;
a=0;// .source "SqlDateType.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final singleTon:Lcom/j256/ormlite/field/types/SqlDateType;
a=0;// 
a=0;// .field private static final sqlDateFormatConfig:Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/SqlDateType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/SqlDateType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/types/SqlDateType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/SqlDateType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->singleTon:Lcom/j256/ormlite/field/types/SqlDateType;
a=0;// 
a=0;//     .line 22
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;);
a=0;//     const-string v1, "yyyy-MM-dd"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->sqlDateFormatConfig:Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->DATE:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-class v3, Ljava/sql/Date;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/DateType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/SqlDateType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
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
a=0;//     .line 36
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/DateType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/SqlDateType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSingleton()Lcom/j256/ormlite/field/types/SqlDateType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->singleTon:Lcom/j256/ormlite/field/types/SqlDateType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/SqlDateType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected getDefaultDateFormatConfig()Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/SqlDateType;->sqlDateFormatConfig:Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isValidForField(Ljava/lang/reflect/Field;)Z
a=0;//     .locals 2
a=0;//     .param p1, "field"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v1, Ljava/sql/Date;
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
a=0;// .method public javaToSqlArg(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "javaObject"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/sql/Date;
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "date":Ljava/sql/Date;
a=0;//     new-instance v1, Ljava/sql/Timestamp;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/Timestamp;);
a=0;//     invoke-virtual {v0}, Ljava/sql/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/sql/Timestamp;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/Timestamp;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public resultStringToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "stringValue"    # Ljava/lang/String;
a=0;//     .param p3, "columnPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-static {p2}, Ljava/sql/Timestamp;->valueOf(Ljava/lang/String;)Ljava/sql/Timestamp;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/Timestamp;);
a=0;//     invoke-virtual {p0, p1, v0, p3}, Lcom/j256/ormlite/field/types/SqlDateType;->sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "sqlArg"    # Ljava/lang/Object;
a=0;//     .param p3, "columnPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/sql/Timestamp;
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "value":Ljava/sql/Timestamp;
a=0;//     new-instance v1, Ljava/sql/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/Date;);
a=0;//     invoke-virtual {v0}, Ljava/sql/Timestamp;->getTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/sql/Date;-><init>(J)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/Date;);
a=0;//     return-object v1
a=0;// .end method
}}
