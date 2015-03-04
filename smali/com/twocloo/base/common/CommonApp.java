package com.twocloo.base.common; class CommonApp { void a() { int a;
a=0;// .class public Lcom/twocloo/base/common/CommonApp;
a=0;// .super Landroid/app/Application;
a=0;// .source "CommonApp.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static instance:Landroid/app/Application;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 5
a=0;//     invoke-direct {p0}, Landroid/app/Application;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/CommonApp;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Landroid/app/Application;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v0, Lcom/twocloo/base/common/CommonApp;->instance:Landroid/app/Application;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-super {p0}, Landroid/app/Application;->onCreate()V
a=0;// 
a=0;//     .line 12
a=0;//     sput-object p0, Lcom/twocloo/base/common/CommonApp;->instance:Landroid/app/Application;
a=0;// 
a=0;//     .line 15
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CrashHandler;->getInstance()Lcom/twocloo/base/common/CrashHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/CrashHandler;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/common/CommonApp;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/CrashHandler;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
}}
