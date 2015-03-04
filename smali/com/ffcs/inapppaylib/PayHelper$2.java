package com.ffcs.inapppaylib; class PayHelper$2 { void a() { int a;
a=0;// .class Lcom/ffcs/inapppaylib/PayHelper$2;
a=0;// .super Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// .source "PayHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/ffcs/inapppaylib/PayHelper;->confirmPayment(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;)V
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
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     .line 161
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/callback/RequestCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/PayHelper$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onFailure(Lcom/lidroid/xutils/exception/HttpException;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Lcom/lidroid/xutils/exception/HttpException;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v0, Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);
a=0;//     invoke-direct {v0}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;-><init>()V
a=0;// 
a=0;//     .line 166
a=0;//     .local v0, "resp":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->setRes_code(I)V
a=0;// 
a=0;//     .line 167
a=0;//     const-string v1, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->setRes_message(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;->onBillingFailure(Lcom/ffcs/inapppaylib/bean/response/PayResponse;)V
a=0;// 
a=0;//     .line 170
a=0;//     .end local v0    # "resp":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
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
a=0;//     .line 174
a=0;//     .local p1, "result":Lcom/lidroid/xutils/http/ResponseInfo;, "Lcom/lidroid/xutils/http/ResponseInfo<Ljava/lang/String;>;"
a=0;//     iget v3, p1, Lcom/lidroid/xutils/http/ResponseInfo;->statusCode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     iget-object v3, p1, Lcom/lidroid/xutils/http/ResponseInfo;->result:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 175
a=0;//     new-instance v0, Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "gson":Lcom/google/gson/Gson;
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v3, p1, Lcom/lidroid/xutils/http/ResponseInfo;->result:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     const-class v4, Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;// 
a=0;//     .line 177
a=0;//     .local v1, "pay":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     invoke-virtual {v1}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->getRes_code()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v1}, Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;->onBillingSuccess(Lcom/ffcs/inapppaylib/bean/response/PayResponse;)V
a=0;// 
a=0;//     .line 194
a=0;//     .end local v0    # "gson":Lcom/google/gson/Gson;
a=0;//     .end local v1    # "pay":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 182
a=0;//     .restart local v0    # "gson":Lcom/google/gson/Gson;
a=0;//     .restart local v1    # "pay":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);v1=(Reference,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);v2=(Uninit);v3=(Integer);v4=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v1}, Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;->onBillingFailure(Lcom/ffcs/inapppaylib/bean/response/PayResponse;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     .end local v0    # "gson":Lcom/google/gson/Gson;
a=0;//     .end local v1    # "pay":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Conflicted);v4=(PosShort);
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v2, Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);
a=0;//     invoke-direct {v2}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;-><init>()V
a=0;// 
a=0;//     .line 189
a=0;//     .local v2, "resp":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     #v2=(Reference,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {v2, v3}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->setRes_code(I)V
a=0;// 
a=0;//     .line 190
a=0;//     const-string v3, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->setRes_message(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayHelper$2;->this$0:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/PayHelper;->access$1(Lcom/ffcs/inapppaylib/PayHelper;)Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v2}, Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;->onBillingFailure(Lcom/ffcs/inapppaylib/bean/response/PayResponse;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
