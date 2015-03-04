package com.twocloo.com.cn.fragment; class LishiWordsFragment$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LishiWordsFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/LishiWordsFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 3
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->access$0(Lcom/twocloo/com/cn/fragment/LishiWordsFragment;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/LishiWordsFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/SearchResultActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "key_word"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->access$0(Lcom/twocloo/com/cn/fragment/LishiWordsFragment;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/LishiWordsFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LishiWordsFragment;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/fragment/LishiWordsFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
