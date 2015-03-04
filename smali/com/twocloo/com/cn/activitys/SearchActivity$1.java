package com.twocloo.com.cn.activitys; class SearchActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/SearchActivity$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/TextView$OnEditorActionListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/SearchActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/SearchActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/SearchActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SearchActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SearchActivity;
a=0;// 
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SearchActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "v"    # Landroid/widget/TextView;
a=0;//     .param p2, "actionId"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne p2, v4, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/SearchActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SearchActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/SearchActivity;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/SearchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     .local v2, "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 111
a=0;//     .local v3, "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/fragment/SearchResultFragment;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;-><init>()V
a=0;// 
a=0;//     .line 112
a=0;//     .local v1, "fragment":Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "key_word"
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/SearchActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/SearchActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/SearchActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/SearchActivity;->access$0(Lcom/twocloo/com/cn/activitys/SearchActivity;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->setArguments(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 115
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->menu_search_ly_lv:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v3}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 117
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 119
a=0;//     .end local v0    # "bundle":Landroid/os/Bundle;
a=0;//     .end local v1    # "fragment":Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;//     .end local v2    # "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     .end local v3    # "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(PosByte);v5=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
