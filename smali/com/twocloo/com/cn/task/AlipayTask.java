package com.twocloo.com.cn.task; class AlipayTask { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/task/AlipayTask;
a=0;// .super Lcom/twocloo/base/sync/EasyTask;
a=0;// .source "AlipayTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/sync/EasyTask",
a=0;//         "<",
a=0;//         "Landroid/app/Activity;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected alipay:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;// .field protected volatile isRunning:Z
a=0;// 
a=0;// .field protected mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;// .field protected pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Lcom/twocloo/base/alipay/Alipay;)V
a=0;//     .locals 0
a=0;//     .param p1, "caller"    # Landroid/app/Activity;
a=0;//     .param p2, "alipay"    # Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/sync/EasyTask;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/AlipayTask;);
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/task/AlipayTask;->alipay:Lcom/twocloo/base/alipay/Alipay;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/task/AlipayTask;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/AlipayTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/AlipayTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Void;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;//     .locals 11
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v10=(Null);
a=0;//     iget-boolean v8, p0, Lcom/twocloo/com/cn/task/AlipayTask;->isRunning:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Boolean);v9=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 59
a=0;//     .local v7, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/task/AlipayTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/app/Activity;
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$id;->consume_zfb_input:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/EditText;
a=0;// 
a=0;//     .line 60
a=0;//     .local v2, "input":Landroid/widget/EditText;
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     .local v3, "money":D
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     sget-object v8, Lcom/twocloo/com/cn/task/AlipayTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/task/AlipayTask$1;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/task/AlipayTask$1;);
a=0;//     invoke-direct {v9, p0}, Lcom/twocloo/com/cn/task/AlipayTask$1;-><init>(Lcom/twocloo/com/cn/task/AlipayTask;)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/task/AlipayTask$1;);
a=0;//     invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_2
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/text/Editable;);
a=0;//     invoke-interface {v8}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 73
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8, v3, v4}, Lcom/twocloo/com/cn/http/HttpImpl;->alipayApp(Ljava/lang/String;D)Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "aliPayBean":Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/AliPayBean;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/AliPayBean;->getContent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 76
a=0;//     .local v5, "orderInfo":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/AliPayBean;->getSign()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 77
a=0;//     .local v1, "encodeStrSign":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/AliPayBean;->getSign_type()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 78
a=0;//     .local v6, "signType":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;// 
a=0;//     .end local v0    # "aliPayBean":Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/AliPayBean;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/AliPayBean;-><init>()V
a=0;// 
a=0;//     .line 80
a=0;//     .restart local v0    # "aliPayBean":Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/AliPayBean;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/task/AlipayTask;->HANDLER:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v9, Lcom/twocloo/com/cn/task/AlipayTask$2;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/task/AlipayTask$2;);
a=0;//     invoke-direct {v9, p0, v5, v1, v6}, Lcom/twocloo/com/cn/task/AlipayTask$2;-><init>(Lcom/twocloo/com/cn/task/AlipayTask;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/task/AlipayTask$2;);
a=0;//     invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/task/AlipayTask;->onPostExecute(Ljava/lang/Void;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPostExecute(Ljava/lang/Void;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Ljava/lang/Void;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/task/AlipayTask;->isRunning:Z
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/AlipayTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreExecute()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/task/AlipayTask;->caller:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/task/AlipayTask;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
}}
