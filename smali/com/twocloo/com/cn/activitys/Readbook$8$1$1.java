package com.twocloo.com.cn.activitys; class Readbook$8$1$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook$8$1;->callBack(Lcom/twocloo/com/cn/beans/SubResultBean;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;// .field private final synthetic val$token:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook$8$1;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     .line 1129
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;);
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
a=0;//     .line 1132
a=0;//     #v8=(One);
a=0;//     invoke-static {}, Landroid/os/Looper;->prepare()V
a=0;// 
a=0;//     .line 1133
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->access$1(Lcom/twocloo/com/cn/activitys/Readbook$8$1;)Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook$8;->access$0(Lcom/twocloo/com/cn/activitys/Readbook$8;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->access$1(Lcom/twocloo/com/cn/activitys/Readbook$8$1;)Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook$8;->access$0(Lcom/twocloo/com/cn/activitys/Readbook$8;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->val$token:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v6, v7}, Lcom/twocloo/com/cn/http/HttpImpl;->Subed_chapters_info(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1134
a=0;//     .local v1, "sci":Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1157
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1137
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1138
a=0;//     .local v2, "set":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v2}, Ljava/util/HashSet;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1141
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$8$1;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->access$1(Lcom/twocloo/com/cn/activitys/Readbook$8$1;)Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook$8;->access$0(Lcom/twocloo/com/cn/activitys/Readbook$8;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v0, v4}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1142
a=0;//     .local v0, "rht":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 1143
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->access$1(Lcom/twocloo/com/cn/activitys/Readbook$8$1;)Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook$8;->access$0(Lcom/twocloo/com/cn/activitys/Readbook$8;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v8, v6}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->updateRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1144
a=0;//     .local v3, "success":I
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 1145
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->val$uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$8$1$1;->this$2:Lcom/twocloo/com/cn/activitys/Readbook$8$1;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook$8$1;->access$1(Lcom/twocloo/com/cn/activitys/Readbook$8$1;)Lcom/twocloo/com/cn/activitys/Readbook$8;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook$8;->access$0(Lcom/twocloo/com/cn/activitys/Readbook$8;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5, v8, v6}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->insertRecord(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 1147
a=0;//     :cond_2
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 1149
a=0;//     invoke-static {}, Landroid/os/Looper;->loop()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
