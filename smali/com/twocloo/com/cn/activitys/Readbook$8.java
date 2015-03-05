package com.twocloo.com.cn.activitys; class Readbook$8 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook;->checkAutoOrder()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;// .field private final synthetic val$apptype:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$auth:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$channel:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$time:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$token:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$time:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$auth:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$apptype:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p7, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$channel:Ljava/lang/String;
a=0;// 
a=0;//     .line 1094
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/Readbook$8;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1094
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 1098
a=0;//     #v10=(Null);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/com/cn/common/LocalStore;->getIsMonthlyPayment(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1099
a=0;//     .local v4, "v":I
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v11, :cond_0
a=0;// 
a=0;//     .line 1100
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/com/cn/http/HttpImpl;->downVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1101
a=0;//     .local v2, "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 1103
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5, v9, v6}, Lcom/twocloo/com/cn/common/LocalStore;->setIsMonthlyPayment(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 1104
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 1112
a=0;//     .end local v2    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-ne v4, v9, :cond_2
a=0;// 
a=0;//     .line 1113
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v7, v7, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5, v6, v7}, Lcom/twocloo/com/cn/common/LocalStore;->getAuto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1114
a=0;//     .local v0, "auto":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 1116
a=0;//     new-instance v5, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/threads/GetAutoOrderThread;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v6, v7}, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/threads/GetAutoOrderThread;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->queryToServer()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1118
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 1120
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://app.2cloo.com/book-sub_text?textid=%s&uid=%s&token=%s&t=%s&auth=%s&v=%s&ct=android&pt=%s&srcid=%s"
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v7, v10
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v7, v9
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v8, v7, v11
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$time:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$auth:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$apptype:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x7
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$channel:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1121
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1120
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1122
a=0;//     .local v3, "url":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/task/VipChapterSubTask;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/task/VipChapterSubTask;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/Readbook$8$1;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v7, p0, v8, v9}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;-><init>(Lcom/twocloo/com/cn/activitys/Readbook$8;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1;);
a=0;//     invoke-direct {v5, v6, v3, v7}, Lcom/twocloo/com/cn/task/VipChapterSubTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/task/VipChapterSubTask;);
a=0;//     new-array v6, v10, [Ljava/lang/Void;
a=0;// 
a=0;//     .line 1161
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/task/VipChapterSubTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1171
a=0;//     .end local v0    # "auto":Ljava/lang/String;
a=0;//     .end local v3    # "url":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1107
a=0;//     .restart local v2    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v3=(Uninit);v6=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);v9=(One);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5, v10, v6}, Lcom/twocloo/com/cn/common/LocalStore;->setIsMonthlyPayment(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 1108
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1163
a=0;//     .end local v2    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .restart local v0    # "auto":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v4=(Integer);v5=(Boolean);v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;// 
a=0;//     invoke-direct {v1, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1164
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v5, "aid"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1165
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1166
a=0;//     const-string v5, "from"
a=0;// 
a=0;//     const-string v6, " "
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1167
a=0;//     const-string v5, "ordertype"
a=0;// 
a=0;//     const-string v6, "one"
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1168
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     const/16 v6, 0x3e8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     #invoke-virtual {v5, v1, v6}, Lcom/twocloo/com/cn/activitys/Readbook;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     #invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->addChaping()V
a=0;//     goto :goto_1
a=0;// .end method
}}
