package com.twocloo.com.cn.activitys; class EditProfileActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EditProfileActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/EditProfileActivity;->onClick(Landroid/view/View;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;// .field private final synthetic val$items:[Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;[Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;->val$items:[Ljava/lang/String;
a=0;// 
a=0;//     .line 272
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;->val$items:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v0, v0, p2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "\u7537"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$13(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u7537"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 281
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 277
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;->val$items:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v0, v0, p2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "\u5973"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$13(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u5973"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
