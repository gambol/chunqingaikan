package com.twocloo.com.cn.task; class BookShelfInitTask$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/task/BookShelfInitTask$2;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "BookShelfInitTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/task/BookShelfInitTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/task/BookShelfInitTask;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;->this$0:Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// 
a=0;//     .line 152
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/task/BookShelfInitTask$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     :goto_0
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;->this$0:Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/task/BookShelfInitTask;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/task/BookShelfInitTask;->access$2(Lcom/twocloo/com/cn/task/BookShelfInitTask;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isFinish()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     .line 157
a=0;//     .local v5, "tb":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Lcom/twocloo/com/cn/http/DownFile;>;"
a=0;//     #v5=(Reference,Ljava/util/Hashtable;);
a=0;//     sget-object v6, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Hashtable;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     sget-object v6, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/Hashtable;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_2
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 159
a=0;//     .local v1, "dl":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_2
a=0;//     #v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;->this$0:Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/task/BookShelfInitTask;->access$2(Lcom/twocloo/com/cn/task/BookShelfInitTask;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/16 v7, 0x11
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 179
a=0;//     .end local v1    # "dl":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-wide/16 v6, 0xfa
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-static {v6, v7}, Landroid/os/SystemClock;->sleep(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     .restart local v1    # "dl":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v6=(Boolean);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 160
a=0;//     .local v2, "key":Ljava/lang/String;
a=0;//     invoke-virtual {v5, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     .line 161
a=0;//     .local v0, "df":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     iget v6, v0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     if-ne v6, v8, :cond_4
a=0;// 
a=0;//     .line 162
a=0;//     sget-object v6, Lcom/twocloo/com/cn/common/HCData;->downOK:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/http/DownFile;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 164
a=0;//     const-string v6, "\u4e0b\u8f7d\u5b8c\u6210"
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 165
a=0;//     :cond_4
a=0;//     #v6=(Integer);v8=(One);
a=0;//     iget v6, v0, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;// 
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v6, v8, :cond_1
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v3, Landroid/os/Message;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v3}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     .local v3, "msMessage":Landroid/os/Message;
a=0;//     #v3=(Reference,Landroid/os/Message;);
a=0;//     const/16 v6, 0x12
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iput v6, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/http/DownFile;->title:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iput-object v6, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/task/BookShelfInitTask$2;->this$0:Lcom/twocloo/com/cn/task/BookShelfInitTask;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/task/BookShelfInitTask;->access$2(Lcom/twocloo/com/cn/task/BookShelfInitTask;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getHandler()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 173
a=0;//     .end local v0    # "df":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     .end local v2    # "key":Ljava/lang/String;
a=0;//     .end local v3    # "msMessage":Landroid/os/Message;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v7=(Boolean);v8=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     .line 174
a=0;//     .local v4, "string":Ljava/lang/String;
a=0;//     invoke-virtual {v5, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
