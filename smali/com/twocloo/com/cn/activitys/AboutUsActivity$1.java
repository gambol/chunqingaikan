package com.twocloo.com.cn.activitys; class AboutUsActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "AboutUsActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 12
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     #v4=(Null);
a=0;//     iget v11, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 47
a=0;//     .local v11, "id":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v11, v1, :cond_2
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AboutUsActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->access$0(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->access$0(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getVersionCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 50
a=0;//     .local v2, "code":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->access$0(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getIsforce()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 51
a=0;//     .local v6, "isforce":Z
a=0;//     #v6=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->access$0(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getWrongversion()[I
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 52
a=0;//     .local v7, "wrongversion":[I
a=0;//     #v7=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->access$0(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getAppurl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 53
a=0;//     .local v3, "apkurl":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->access$0(Lcom/twocloo/com/cn/activitys/AboutUsActivity;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getFeatures()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 54
a=0;//     .local v8, "arr":[Ljava/lang/String;
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     .local v9, "buffer":Ljava/lang/StringBuffer;
a=0;//     #v9=(Reference,Ljava/lang/StringBuffer;);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     array-length v1, v8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);v10=(Integer);
a=0;//     array-length v1, v8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v10, v1, :cond_3
a=0;// 
a=0;//     .line 63
a=0;//     .end local v10    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v2, v1, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AboutUsActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/AboutUsActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, "\u60a8\u7684\u7248\u672c\u5df2\u662f\u6700\u65b0\u7248\u672c"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v5, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AboutUsActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AboutUsActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/AboutUsActivity;);
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/twocloo/com/cn/http/MyAutoUpdate;-><init>(Landroid/app/Activity;ILjava/lang/String;ZLjava/lang/String;Z[I)V
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "update":Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->check()V
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "update":Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;//     .end local v2    # "code":I
a=0;//     .end local v3    # "apkurl":Ljava/lang/String;
a=0;//     .end local v6    # "isforce":Z
a=0;//     .end local v7    # "wrongversion":[I
a=0;//     .end local v8    # "arr":[Ljava/lang/String;
a=0;//     .end local v9    # "buffer":Ljava/lang/StringBuffer;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     .restart local v2    # "code":I
a=0;//     .restart local v3    # "apkurl":Ljava/lang/String;
a=0;//     .restart local v6    # "isforce":Z
a=0;//     .restart local v7    # "wrongversion":[I
a=0;//     .restart local v8    # "arr":[Ljava/lang/String;
a=0;//     .restart local v9    # "buffer":Ljava/lang/StringBuffer;
a=0;//     .restart local v10    # "i":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Integer);v3=(Reference,Ljava/lang/String;);v6=(Boolean);v7=(Reference,[I);v8=(Reference,[Ljava/lang/String;);v9=(Reference,Ljava/lang/StringBuffer;);v10=(Integer);
a=0;//     aget-object v1, v8, v10
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     aget-object v5, v8, v10
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     add-int/lit8 v5, v10, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u3001"
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aget-object v5, v8, v10
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 56
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
