package com.twocloo.com.cn.fragment; class BookShelfFragment$13 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookShelfFragment;->BatchSubscription(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$activity:Landroid/app/Activity;
a=0;// 
a=0;// .field private final synthetic val$articleid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$ordertype:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private final synthetic val$source:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/app/ProgressDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$source:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$ordertype:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 1090
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     .line 1094
a=0;//     #v13=(One);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1095
a=0;//     .local v5, "mulu":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1096
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v11}, Lcom/twocloo/com/cn/http/HttpImpl;->ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1097
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10, v5}, Lcom/twocloo/com/cn/common/Util;->write(Ljava/lang/String;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;// 
a=0;//     .line 1099
a=0;//     :cond_0
a=0;//     #v11=(Conflicted);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1100
a=0;//     .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 1101
a=0;//     .local v0, "firstVip":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1102
a=0;//     .local v1, "hasVip":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1109
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1110
a=0;//     .local v8, "token":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     sget-object v12, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v11, v12, v8}, Lcom/twocloo/com/cn/http/HttpImpl;->Subed_chapters_info(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1111
a=0;//     .local v7, "sci":Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 1212
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Integer);v3=(Conflicted);v6=(Conflicted);v9=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1116
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Null);v3=(Uninit);v6=(Uninit);v9=(Uninit);v13=(One);
a=0;//     const-string v10, "-1"
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_last_textid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 1117
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$1;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$1;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v13, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v11, p0, v12, v13}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$1;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;Landroid/app/Activity;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$1;);
a=0;//     invoke-virtual {v10, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1125
a=0;//     :cond_2
a=0;//     #v10=(Boolean);v13=(One);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_last_textid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     const-string v10, "0"
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_last_textid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_7
a=0;// 
a=0;//     .line 1126
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_last_textid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1127
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1145
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v2=(Integer);v10=(Conflicted);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 1147
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$2;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$2;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v13, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v11, p0, v12, v13}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$2;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;Landroid/app/Activity;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$2;);
a=0;//     invoke-virtual {v10, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1130
a=0;//     :cond_3
a=0;//     #v10=(Integer);v13=(One);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ne v10, v13, :cond_6
a=0;// 
a=0;//     .line 1131
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1132
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/HashSet;);
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-nez v10, :cond_5
a=0;// 
a=0;//     .line 1133
a=0;//     :cond_4
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1134
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1136
a=0;//     :cond_5
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v11, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_8
a=0;// 
a=0;//     .line 1129
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v10=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     :cond_7
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-lt v2, v10, :cond_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1139
a=0;//     :cond_8
a=0;//     #v1=(One);v10=(Boolean);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1140
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1157
a=0;//     :cond_9
a=0;//     #v1=(Boolean);v10=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ne v2, v10, :cond_a
a=0;// 
a=0;//     .line 1159
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$3;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$3;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v13, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v11, p0, v12, v13}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$3;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;Landroid/app/Activity;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$3;);
a=0;//     invoke-virtual {v10, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1170
a=0;//     :cond_a
a=0;//     #v10=(Integer);v13=(One);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10, v11}, Lcom/twocloo/com/cn/common/LocalStore;->getIsMonthlyPayment(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1171
a=0;//     .local v9, "v":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     if-ne v9, v10, :cond_b
a=0;// 
a=0;//     .line 1172
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v10, v0}, Lcom/twocloo/com/cn/http/HttpImpl;->downVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1173
a=0;//     .local v6, "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v6, :cond_d
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     if-nez v10, :cond_d
a=0;// 
a=0;//     .line 1175
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10, v13, v11}, Lcom/twocloo/com/cn/common/LocalStore;->setIsMonthlyPayment(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 1176
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 1183
a=0;//     .end local v6    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_b
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);v10=(Conflicted);
a=0;//     if-ne v9, v13, :cond_e
a=0;// 
a=0;//     .line 1184
a=0;//     const-string v10, "qidian"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$source:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_c
a=0;// 
a=0;//     .line 1185
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$4;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$4;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v11, p0, v12}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$4;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;Landroid/app/Activity;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$4;);
a=0;//     invoke-virtual {v10, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1195
a=0;//     :cond_c
a=0;//     #v10=(Conflicted);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     const-class v11, Lcom/twocloo/com/cn/activitys/RechargeActivity;
a=0;// 
a=0;//     invoke-direct {v3, v10, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1196
a=0;//     .local v3, "intent":Landroid/content/Intent;
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v10, "aid"
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1197
a=0;//     const-string v10, "textid"
a=0;// 
a=0;//     invoke-virtual {v3, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1198
a=0;//     const-string v10, "isVip"
a=0;// 
a=0;//     invoke-virtual {v3, v10, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1199
a=0;//     const-string v10, "from"
a=0;// 
a=0;//     const-string v11, "bookrack"
a=0;// 
a=0;//     invoke-virtual {v3, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1200
a=0;//     const-string v10, "ordertype"
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$ordertype:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1201
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v10, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1211
a=0;//     .end local v3    # "intent":Landroid/content/Intent;
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$28(Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1179
a=0;//     .restart local v6    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_d
a=0;//     #v3=(Uninit);v6=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$articleid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10, v11, v12}, Lcom/twocloo/com/cn/common/LocalStore;->setIsMonthlyPayment(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 1180
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1203
a=0;//     .end local v6    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_e
a=0;//     #v6=(Conflicted);v9=(Integer);v10=(Conflicted);v11=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v11, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$5;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$5;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v11, p0, v12}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$5;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$13;Landroid/app/Activity;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$13$5;);
a=0;//     invoke-virtual {v10, v11}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
