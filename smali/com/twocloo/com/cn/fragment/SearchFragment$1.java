package com.twocloo.com.cn.fragment; class SearchFragment$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/SearchFragment$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/TextView$OnEditorActionListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/SearchFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/SearchFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchFragment$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/widget/TextView;
a=0;//     .param p2, "actionId"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 110
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p2, v2, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/SearchFragment;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/SearchFragment;->access$0(Lcom/twocloo/com/cn/fragment/SearchFragment;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/SearchFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/SearchResultActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "key_word"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/SearchFragment;->access$0(Lcom/twocloo/com/cn/fragment/SearchFragment;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/fragment/SearchFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/SearchFragment;->access$1(Lcom/twocloo/com/cn/fragment/SearchFragment;)V
a=0;// 
a=0;//     .line 119
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 117
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/SearchFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/SearchFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/SearchFragment;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u641c\u7d22\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
