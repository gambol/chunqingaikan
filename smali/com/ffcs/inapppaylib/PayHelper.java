package com.ffcs.inapppaylib; class PayHelper { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/PayHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PayHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;,
a=0;//         Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;,
a=0;//         Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static instance:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private appId:Ljava/lang/String;
a=0;// 
a=0;// .field private appSecret:Ljava/lang/String;
a=0;// 
a=0;// .field private connTimeout:I
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private imsi:Ljava/lang/String;
a=0;// 
a=0;// .field private payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;// .field private payListener:Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;// .field private queryListener:Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;// .field private validataListener:Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     const/16 v0, 0x1f40
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->connTimeout:I
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->validataListener:Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payListener:Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->queryListener:Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/ffcs/inapppaylib/PayHelper;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     const-class v1, Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayHelper;->instance:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-direct {v0, p0}, Lcom/ffcs/inapppaylib/PayHelper;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     sput-object v0, Lcom/ffcs/inapppaylib/PayHelper;->instance:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayHelper;->instance:Lcom/ffcs/inapppaylib/PayHelper;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 49
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkValidata(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "payCode"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iput-object p2, p0, Lcom/ffcs/inapppaylib/PayHelper;->validataListener:Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v2, Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     invoke-direct {v2}, Lcom/lidroid/xutils/http/RequestParams;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     .local v2, "params":Lcom/lidroid/xutils/http/RequestParams;
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     const-string v5, "app_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->appId:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v5, p0, Lcom/ffcs/inapppaylib/PayHelper;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/ffcs/inapppaylib/util/DeviceUtil;->getIMSI(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/ffcs/inapppaylib/PayHelper;->imsi:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     const-string v5, "imsi"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->imsi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     const-string v5, "pay_code"
a=0;// 
a=0;//     invoke-virtual {v2, v5, p1}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/ffcs/inapppaylib/util/TimeTool;->getTimestamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 92
a=0;//     .local v3, "timestamp":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v2, v5, v3}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v1, Ljava/util/TreeMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/TreeMap;);
a=0;//     invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V
a=0;// 
a=0;//     .line 95
a=0;//     .local v1, "map":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/TreeMap;);
a=0;//     const-string v5, "app_id"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 96
a=0;//     const-string v5, "imsi"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->imsi:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 97
a=0;//     const-string v5, "pay_code"
a=0;// 
a=0;//     invoke-virtual {v1, v5, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 98
a=0;//     const-string v5, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v1, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 99
a=0;//     const-string v5, "sign"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->appSecret:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v6}, Lopen189/sign/ParamsSign;->value(Ljava/util/TreeMap;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     const-string v4, "http://118.85.194.4:8083/iapSms/ws/validate"
a=0;// 
a=0;//     .line 102
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/HttpUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     iget v5, p0, Lcom/ffcs/inapppaylib/PayHelper;->connTimeout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v0, v5}, Lcom/lidroid/xutils/HttpUtils;-><init>(I)V
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "http":Lcom/lidroid/xutils/HttpUtils;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->POST:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     new-instance v6, Lcom/ffcs/inapppaylib/PayHelper$1;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/ffcs/inapppaylib/PayHelper$1;);
a=0;//     invoke-direct {v6, p0}, Lcom/ffcs/inapppaylib/PayHelper$1;-><init>(Lcom/ffcs/inapppaylib/PayHelper;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/ffcs/inapppaylib/PayHelper$1;);
a=0;//     invoke-virtual {v0, v5, v4, v2, v6}, Lcom/lidroid/xutils/HttpUtils;->send(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public confirmPayment(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "tradeId"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     iput-object p2, p0, Lcom/ffcs/inapppaylib/PayHelper;->payListener:Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v2, Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     invoke-direct {v2}, Lcom/lidroid/xutils/http/RequestParams;-><init>()V
a=0;// 
a=0;//     .line 150
a=0;//     .local v2, "params":Lcom/lidroid/xutils/http/RequestParams;
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     const-string v5, "trade_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, p1}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     invoke-static {}, Lcom/ffcs/inapppaylib/util/TimeTool;->getTimestamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 152
a=0;//     .local v3, "timestamp":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v2, v5, v3}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v1, Ljava/util/TreeMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/TreeMap;);
a=0;//     invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "map":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/TreeMap;);
a=0;//     const-string v5, "trade_id"
a=0;// 
a=0;//     invoke-virtual {v1, v5, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 156
a=0;//     const-string v5, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v1, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 157
a=0;//     const-string v5, "sign"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->appSecret:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v6}, Lopen189/sign/ParamsSign;->value(Ljava/util/TreeMap;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     const-string v4, "http://118.85.194.4:8083/iapSms/ws/billing"
a=0;// 
a=0;//     .line 160
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/HttpUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     iget v5, p0, Lcom/ffcs/inapppaylib/PayHelper;->connTimeout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v0, v5}, Lcom/lidroid/xutils/HttpUtils;-><init>(I)V
a=0;// 
a=0;//     .line 161
a=0;//     .local v0, "http":Lcom/lidroid/xutils/HttpUtils;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->POST:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     new-instance v6, Lcom/ffcs/inapppaylib/PayHelper$2;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/ffcs/inapppaylib/PayHelper$2;);
a=0;//     invoke-direct {v6, p0}, Lcom/ffcs/inapppaylib/PayHelper$2;-><init>(Lcom/ffcs/inapppaylib/PayHelper;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/ffcs/inapppaylib/PayHelper$2;);
a=0;//     invoke-virtual {v0, v5, v4, v2, v6}, Lcom/lidroid/xutils/HttpUtils;->send(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     .line 196
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public init(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "appId"    # Ljava/lang/String;
a=0;//     .param p2, "appSecret"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper;->appId:Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     iput-object p2, p0, Lcom/ffcs/inapppaylib/PayHelper;->appSecret:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public pay(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "payCode"    # Ljava/lang/String;
a=0;//     .param p3, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-static {p1, p3}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->getPayDialog(Landroid/content/Context;Landroid/os/Handler;)Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iput-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->checkValidata(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public queryOrder(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "tradeId"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iput-object p2, p0, Lcom/ffcs/inapppaylib/PayHelper;->queryListener:Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v2, Lcom/lidroid/xutils/http/RequestParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     invoke-direct {v2}, Lcom/lidroid/xutils/http/RequestParams;-><init>()V
a=0;// 
a=0;//     .line 205
a=0;//     .local v2, "params":Lcom/lidroid/xutils/http/RequestParams;
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     const-string v5, "trade_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, p1}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-static {}, Lcom/ffcs/inapppaylib/util/TimeTool;->getTimestamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 207
a=0;//     .local v3, "timestamp":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v2, v5, v3}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 209
a=0;//     new-instance v1, Ljava/util/TreeMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/TreeMap;);
a=0;//     invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     .local v1, "map":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/TreeMap;);
a=0;//     const-string v5, "trade_id"
a=0;// 
a=0;//     invoke-virtual {v1, v5, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 211
a=0;//     const-string v5, "timestamp"
a=0;// 
a=0;//     invoke-virtual {v1, v5, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 212
a=0;//     const-string v5, "sign"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/ffcs/inapppaylib/PayHelper;->appSecret:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v6}, Lopen189/sign/ParamsSign;->value(Ljava/util/TreeMap;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/lidroid/xutils/http/RequestParams;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 214
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 215
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/HttpUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     iget v5, p0, Lcom/ffcs/inapppaylib/PayHelper;->connTimeout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v0, v5}, Lcom/lidroid/xutils/HttpUtils;-><init>(I)V
a=0;// 
a=0;//     .line 216
a=0;//     .local v0, "http":Lcom/lidroid/xutils/HttpUtils;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->POST:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     new-instance v6, Lcom/ffcs/inapppaylib/PayHelper$3;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/ffcs/inapppaylib/PayHelper$3;);
a=0;//     invoke-direct {v6, p0}, Lcom/ffcs/inapppaylib/PayHelper$3;-><init>(Lcom/ffcs/inapppaylib/PayHelper;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/ffcs/inapppaylib/PayHelper$3;);
a=0;//     invoke-virtual {v0, v5, v4, v2, v6}, Lcom/lidroid/xutils/HttpUtils;->send(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public quitPay()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->isPaying:Z
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPayListener(Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper;->payListener:Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnQueryListener(Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper;->queryListener:Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     .line 262
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnValidataListener(Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper;->validataListener:Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;//     .line 258
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public settimeout(I)V
a=0;//     .locals 0
a=0;//     .param p1, "timeout"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iput p1, p0, Lcom/ffcs/inapppaylib/PayHelper;->connTimeout:I
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
}}
