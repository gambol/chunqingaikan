package com.ffcs.inapppaylib; class PayHelper$3 { void a() { int a;
a=0;// .class Lcom/ffcs/inapppaylib/PayHelper$3;
a=0;// .super Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// .source "PayHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/ffcs/inapppaylib/PayHelper;->queryOrder(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/ffcs/inapppaylib/PayHelper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     .line 216
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/callback/RequestCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/PayHelper$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onFailure(Lcom/lidroid/xutils/exception/HttpException;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "error"    # Lcom/lidroid/xutils/exception/HttpException;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-static {v0}, Lcom/ffcs/inapppaylib/PayHelper;->access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/ffcs/inapppaylib/PayHelper;->access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p2, v1}, Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;->onQueryFinish(Ljava/lang/String;Lcom/ffcs/inapppaylib/bean/response/QueryResponse;)V
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSuccess(Lcom/lidroid/xutils/http/ResponseInfo;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/lidroid/xutils/http/ResponseInfo",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     .local p1, "responseInfo":Lcom/lidroid/xutils/http/ResponseInfo;, "Lcom/lidroid/xutils/http/ResponseInfo<Ljava/lang/String;>;"
a=0;//     iget v2, p1, Lcom/lidroid/xutils/http/ResponseInfo;->statusCode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     iget-object v2, p1, Lcom/lidroid/xutils/http/ResponseInfo;->result:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v0, Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V
a=0;// 
a=0;//     .line 221
a=0;//     .local v0, "gson":Lcom/google/gson/Gson;
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v2, p1, Lcom/lidroid/xutils/http/ResponseInfo;->result:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     const-class v3, Lcom/ffcs/inapppaylib/bean/response/QueryResponse;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/ffcs/inapppaylib/bean/response/QueryResponse;
a=0;// 
a=0;//     .line 222
a=0;//     .local v1, "query":Lcom/ffcs/inapppaylib/bean/response/QueryResponse;
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/ffcs/inapppaylib/PayHelper;->access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/ffcs/inapppaylib/PayHelper;->access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v2, p1, Lcom/lidroid/xutils/http/ResponseInfo;->result:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v3, v2, v1}, Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;->onQueryFinish(Ljava/lang/String;Lcom/ffcs/inapppaylib/bean/response/QueryResponse;)V
a=0;// 
a=0;//     .line 230
a=0;//     .end local v0    # "gson":Lcom/google/gson/Gson;
a=0;//     .end local v1    # "query":Lcom/ffcs/inapppaylib/bean/response/QueryResponse;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 226
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Conflicted);v3=(PosShort);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-static {v2}, Lcom/ffcs/inapppaylib/PayHelper;->access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayHelper$3;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/ffcs/inapppaylib/PayHelper;->access$2(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;);
a=0;//     iget-object v2, p1, Lcom/lidroid/xutils/http/ResponseInfo;->result:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v3, v2, v4}, Lcom/ffcs/inapppaylib/PayHelper$onQueryListener;->onQueryFinish(Ljava/lang/String;Lcom/ffcs/inapppaylib/bean/response/QueryResponse;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
