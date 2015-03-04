package com.twocloo.com.cn.threads; class SubedchaptersinfoThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SubedchaptersinfoThread.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private isRunning:Z
a=0;// 
a=0;// .field private mhandler:Landroid/os/Handler;
a=0;// 
a=0;// .field public scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;// .field private token:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "mhandler"    # Landroid/os/Handler;
a=0;//     .param p3, "aid"    # Ljava/lang/String;
a=0;//     .param p4, "uid"    # Ljava/lang/String;
a=0;//     .param p5, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     .line 29
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->isRunning:Z
a=0;// 
a=0;//     .line 22
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->mhandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 23
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 24
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 36
a=0;//     #v8=(One);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v4}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 37
a=0;//     .local v2, "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 38
a=0;//     const-string v4, "-1"
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "recodeIds":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 43
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ","
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     .end local v2    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v4}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 47
a=0;//     .restart local v2    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     #v2=(Null);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 70
a=0;//     const-string v4, ","
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     if-lt v4, v6, :cond_6
a=0;// 
a=0;//     .line 76
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     iget-boolean v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->isRunning:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->mhandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v4, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 79
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     check-cast v4, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->token:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->Subed_chapters_info(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     .end local v2    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v4}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 58
a=0;//     .restart local v2    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5, v8, v6}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->updateRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5, v8, v6}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->insertRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     :cond_5
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     .end local v0    # "count":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Integer);v6=(Integer);v7=(Conflicted);
a=0;//     aget-object v3, v5, v4
a=0;// 
a=0;//     .line 71
a=0;//     .local v3, "s":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 70
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public stopRun()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->isRunning:Z
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
}}
