package com.twocloo.com.cn.ydmm; class IAPListener { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/ydmm/IAPListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IAPListener.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private iapHandler:Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;// .field private rechargeYDMMTask:Lcom/twocloo/com/cn/task/RechargeYDmmTask;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/twocloo/com/cn/ydmm/IAPHandler;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "iapHandler"    # Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/ydmm/IAPListener;);
a=0;//     const-string v0, "IAPListener"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->iapHandler:Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAfterApply()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAfterDownload()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBeforeApply()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBeforeDownload()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBillingFinish(ILjava/util/HashMap;)V
a=0;//     .locals 12
a=0;//     .param p1, "code"    # I
a=0;//     .param p2, "arg1"    # Ljava/util/HashMap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     const-string v0, "IAPListener"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "billing finish, status code = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 67
a=0;//     const-string v11, "\u8ba2\u8d2d\u7ed3\u679c\uff1a\u8ba2\u8d2d\u6210\u529f"
a=0;// 
a=0;//     .line 68
a=0;//     .local v11, "result":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->iapHandler:Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;//     const/16 v1, 0x2711
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/ydmm/IAPHandler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 70
a=0;//     .local v10, "message":Landroid/os/Message;
a=0;//     #v10=(Reference,Landroid/os/Message;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     .local v5, "orderID":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     .local v6, "paycode":Ljava/lang/String;
a=0;//     #v6=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v9, "leftday":Ljava/lang/String;
a=0;//     #v9=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     .local v7, "tradeID":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v8, "ordertype":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     const/16 v0, 0x66
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x68
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x3e9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ne p1, v0, :cond_7
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_6
a=0;// 
a=0;//     .line 84
a=0;//     const-string v0, "LeftDay"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .end local v9    # "leftday":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     .restart local v9    # "leftday":Ljava/lang/String;
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     const-string v0, "OrderId"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .end local v5    # "orderID":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     .restart local v5    # "orderID":Ljava/lang/String;
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ",OrderID \uff1a "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 92
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "Paycode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .end local v6    # "paycode":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/lang/String;
a=0;// 
a=0;//     .line 93
a=0;//     .restart local v6    # "paycode":Ljava/lang/String;
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ",Paycode:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 96
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "TradeID"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .end local v7    # "tradeID":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     .line 97
a=0;//     .restart local v7    # "tradeID":Ljava/lang/String;
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ",tradeID:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 100
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "OrderType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .end local v8    # "ordertype":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Ljava/lang/String;
a=0;// 
a=0;//     .line 101
a=0;//     .restart local v8    # "ordertype":Ljava/lang/String;
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ",ORDERTYPE:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 108
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/RechargeYDmmTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/RechargeYDmmTask;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "http://app.2cloo.com/pay-mmarket_query?userid=%s&OrderID=%s&Paycode=%s&TradeID=%s&OrderType=0"
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 110
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/twocloo/com/cn/task/RechargeYDmmTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/RechargeYDmmTask;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->rechargeYDMMTask:Lcom/twocloo/com/cn/task/RechargeYDmmTask;
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->rechargeYDMMTask:Lcom/twocloo/com/cn/task/RechargeYDmmTask;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/RechargeYDmmTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_6
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     invoke-virtual {v0, v11}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// 
a=0;//     .line 119
a=0;//     :cond_7
a=0;//     #v0=(PosShort);v1=(PosShort);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Null);v7=(Null);v8=(Null);v9=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u8ba2\u8d2d\u7ed3\u679c\uff1a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Lmm/purchasesdk/Purchase;->getReason(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInitFinish(I)V
a=0;//     .locals 5
a=0;//     .param p1, "code"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     const-string v2, "IAPListener"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Init finish, status code = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/ydmm/IAPListener;->iapHandler:Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// 
a=0;//     const/16 v3, 0x2710
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/ydmm/IAPHandler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u521d\u59cb\u5316\u7ed3\u679c\uff1a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Lmm/purchasesdk/Purchase;->getReason(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onQueryFinish(ILjava/util/HashMap;)V
a=0;//     .locals 0
a=0;//     .param p1, "code"    # I
a=0;//     .param p2, "arg1"    # Ljava/util/HashMap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onUnsubscribeFinish(I)V
a=0;//     .locals 0
a=0;//     .param p1, "code"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
}}
