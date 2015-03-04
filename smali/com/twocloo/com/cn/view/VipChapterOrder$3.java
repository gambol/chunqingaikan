package com.twocloo.com.cn.view; class VipChapterOrder$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/VipChapterOrder$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "VipChapterOrder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/view/VipChapterOrder;->buyOrReadBook(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;// .field private final synthetic val$act:Landroid/app/Activity;
a=0;// 
a=0;// .field private final synthetic val$aid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$isVip:I
a=0;// 
a=0;// .field private final synthetic val$textid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$token:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/VipChapterOrder;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     iput p6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$isVip:I
a=0;// 
a=0;//     .line 252
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 255
a=0;//     #v9=(One);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$1(Lcom/twocloo/com/cn/view/VipChapterOrder;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6, v7, v8}, Lcom/twocloo/com/cn/http/HttpImpl;->Subed_chapters_info(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 256
a=0;//     .local v2, "sci":Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 259
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Landroid/app/Activity;);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 261
a=0;//     .local v3, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v3=(Reference,Ljava/util/HashSet;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 262
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v1, v5}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 263
a=0;//     .local v1, "rht":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$1(Lcom/twocloo/com/cn/view/VipChapterOrder;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6, v9, v7}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->updateRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 265
a=0;//     .local v4, "success":I
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$1(Lcom/twocloo/com/cn/view/VipChapterOrder;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6, v9, v7}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->insertRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     :cond_2
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-direct {v0, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v5, "textIds"
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ","
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 272
a=0;//     const-string v5, "aid"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 273
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 274
a=0;//     const-string v5, "isVip"
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$isVip:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/CloseActivity;->closeReadBookDown()V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     instance-of v5, v5, Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v5}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 281
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     .end local v1    # "rht":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     .end local v4    # "success":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Activity;);
a=0;//     const-class v6, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-direct {v0, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 282
a=0;//     .restart local v0    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v5, "aid"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 283
a=0;//     const-string v5, "textid"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$textid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 284
a=0;//     const-string v5, "isVip"
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$isVip:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 285
a=0;//     const-string v5, "from"
a=0;// 
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 286
a=0;//     const-string v5, "ordertype"
a=0;// 
a=0;//     const-string v6, "one"
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$3;->val$act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
