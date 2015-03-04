package com.twocloo.com.cn.jpush; class UpdateBookService$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/jpush/UpdateBookService$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "UpdateBookService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/jpush/UpdateBookService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 16
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v11, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v11, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     .local v8, "sBuilder":Ljava/lang/StringBuilder;
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     .local v10, "updateCount":I
a=0;//     #v10=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-lt v3, v11, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     if-ne v10, v11, :cond_5
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/16 v12, 0xf
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-le v11, v12, :cond_4
a=0;// 
a=0;//     .line 76
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/16 v14, 0xf
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$1(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     :goto_1
a=0;//     #v13=(Conflicted);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const/16 v13, 0x3e9
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$2(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v11, v12, v13, v14, v10}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->sendNotification(Landroid/content/Context;ILjava/lang/String;I)V
a=0;// 
a=0;//     .line 91
a=0;//     .end local v1    # "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
a=0;//     .end local v3    # "i":I
a=0;//     .end local v8    # "sBuilder":Ljava/lang/StringBuilder;
a=0;//     .end local v10    # "updateCount":I
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 52
a=0;//     .restart local v1    # "data":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v8    # "sBuilder":Ljava/lang/StringBuilder;
a=0;//     .restart local v10    # "updateCount":I
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);v3=(Integer);v8=(Reference,Ljava/lang/StringBuilder;);v10=(Integer);v11=(Integer);v15=(Uninit);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 54
a=0;//     .local v2, "ele":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const-string v11, "title"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     .local v9, "title":Ljava/lang/String;
a=0;//     const-string v11, "lastupdate"
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     .local v7, "lastupdate":Ljava/lang/String;
a=0;//     const-string v11, "last_text_time"
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     .local v6, "last_text_time":Ljava/lang/String;
a=0;//     const-string v11, "lastUpdateTime"
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     .local v5, "lastUpdateTime":Ljava/lang/String;
a=0;//     const-string v11, "id"
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     .line 59
a=0;//     .local v4, "id":Ljava/lang/String;
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     const-string v11, "0"
a=0;// 
a=0;//     invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_3
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v13
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     cmp-long v11, v11, v13
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     .line 61
a=0;//     const-string v11, "\u300a"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 63
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     invoke-virtual {v11, v4, v12, v13}, Lcom/twocloo/com/cn/db/DBAdapter;->upLasttime(Ljava/lang/String;J)J
a=0;// 
a=0;//     .line 64
a=0;//     const-string v11, "\u300b"
a=0;// 
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/lit8 v11, v11, -0x1
a=0;// 
a=0;//     if-ge v3, v11, :cond_2
a=0;// 
a=0;//     .line 66
a=0;//     const-string v11, " "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 68
a=0;//     :cond_2
a=0;//     #v11=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     .line 51
a=0;//     :cond_3
a=0;//     #v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     .end local v2    # "ele":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v4    # "id":Ljava/lang/String;
a=0;//     .end local v5    # "lastUpdateTime":Ljava/lang/String;
a=0;//     .end local v6    # "last_text_time":Ljava/lang/String;
a=0;//     .end local v7    # "lastupdate":Ljava/lang/String;
a=0;//     .end local v9    # "title":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v11=(Integer);v12=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v12}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$1(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 81
a=0;//     :cond_5
a=0;//     #v11=(One);v12=(Conflicted);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     if-le v10, v11, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/16 v12, 0xc
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-le v11, v12, :cond_6
a=0;// 
a=0;//     .line 83
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/16 v15, 0xc
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     invoke-virtual {v13, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "...\u7b49"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$1(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     :goto_3
a=0;//     #v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const/16 v13, 0x3e9
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v14=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$2(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v11, v12, v13, v14, v10}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->sendNotification(Landroid/content/Context;ILjava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 85
a=0;//     :cond_6
a=0;//     #v11=(Integer);v12=(PosByte);v13=(Conflicted);v14=(Conflicted);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;->this$0:Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v12}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->access$1(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
