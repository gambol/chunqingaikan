package com.twocloo.com.cn.activitys; class BfMLActivity$5 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BfMLActivity$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BfMLActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BfMLActivity;->initviews()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     .line 261
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 265
a=0;//     .local v0, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-direct {v1, v4}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 266
a=0;//     .end local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-virtual {v1, v4, v5, v6}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookMark(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 268
a=0;//     .local v3, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     const-string v5, "\u6ca1\u6709\u4e66\u7b7e\u53ef\u4ee5\u6e05\u9664"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v4, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 282
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .end local v3    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     .restart local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 272
a=0;//     .end local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v3    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v2=(Uninit);v3=(Reference,Ljava/util/ArrayList;);v4=(Integer);v5=(Null);v6=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteAllMark(Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$21(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ListView;->setVisibility(I)V
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$5;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$22(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setVisibility(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 276
a=0;//     .end local v3    # "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookMark;>;"
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Uninit);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 277
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v2=(Reference,Ljava/lang/Throwable;);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 279
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     .end local v2    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 279
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 281
a=0;//     :cond_4
a=0;//     throw v4
a=0;// 
a=0;//     .line 278
a=0;//     .end local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v2=(Uninit);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 276
a=0;//     .end local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :catch_1
a=0;//     #v0=(Null);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v0    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     goto :goto_1
a=0;// .end method
}}
