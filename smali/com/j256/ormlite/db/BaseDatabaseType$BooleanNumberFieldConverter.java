package com.j256.ormlite.db; class BaseDatabaseType$BooleanNumberFieldConverter { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;
a=0;// .super Lcom/j256/ormlite/field/BaseFieldConverter;
a=0;// .source "BaseDatabaseType.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/db/BaseDatabaseType;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xc
a=0;//     name = "BooleanNumberFieldConverter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 548
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/field/BaseFieldConverter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 550
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->BOOLEAN:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public javaToSqlArg(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 559
a=0;//     .local v0, "bool":Ljava/lang/Boolean;
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Byte;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Byte;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "defaultStr"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 553
a=0;//     invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 554
a=0;//     .local v0, "bool":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Byte;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Byte;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public resultStringToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "stringValue"    # Ljava/lang/String;
a=0;//     .param p3, "columnPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     invoke-static {p2}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Byte;);
a=0;//     invoke-virtual {p0, p1, v0, p3}, Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;->sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public resultToSqlArg(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/DatabaseResults;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .param p3, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     invoke-interface {p2, p3}, Lcom/j256/ormlite/support/DatabaseResults;->getByte(I)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Byte;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "sqlArg"    # Ljava/lang/Object;
a=0;//     .param p3, "columnPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 566
a=0;//     #v1=(One);
a=0;//     check-cast p2, Ljava/lang/Byte;
a=0;// 
a=0;//     .end local p2    # "sqlArg":Ljava/lang/Object;
a=0;//     invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 567
a=0;//     .local v0, "arg":B
a=0;//     #v0=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_0
a=0;// .end method
}}
