package com.j256.ormlite.field.types; class BaseDateType$DateStringFormatConfig { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseDateType.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/field/types/BaseDateType;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xc
a=0;//     name = "DateStringFormatConfig"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final dateFormatStr:Ljava/lang/String;
a=0;// 
a=0;// .field private final threadLocal:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Ljava/text/DateFormat;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "dateFormatStr"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;);
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig$1;-><init>(Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig$1;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;->threadLocal:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 57
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;->dateFormatStr:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDateFormat()Ljava/text/DateFormat;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;->threadLocal:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/text/DateFormat;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/types/BaseDateType$DateStringFormatConfig;->dateFormatStr:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
