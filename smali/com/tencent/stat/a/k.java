package com.tencent.stat.a; class k { void a() { int a;
a=0;// .class public Lcom/tencent/stat/a/k;
a=0;// .super Lcom/tencent/stat/a/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/stat/common/a;
a=0;// 
a=0;// .field private l:Lorg/json/JSONObject;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;ILorg/json/JSONObject;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/a/k;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/k;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/common/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/common/a;);
a=0;//     invoke-direct {v0, p1}, Lcom/tencent/stat/common/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/a;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/k;->a:Lcom/tencent/stat/common/a;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/stat/a/k;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcom/tencent/stat/a/f;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/a/f;->b:Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lorg/json/JSONObject;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/e;->e:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "ut"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/e;->e:Lcom/tencent/stat/DeviceInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/DeviceInfo;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/DeviceInfo;->getUserType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/k;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "cfg"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/k;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/k;->a:Lcom/tencent/stat/common/a;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/stat/common/a;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
