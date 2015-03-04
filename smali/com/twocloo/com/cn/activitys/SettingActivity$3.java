package com.twocloo.com.cn.activitys; class SettingActivity$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/SettingActivity$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SettingActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/SettingActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     .line 128
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "buttonView"    # Landroid/widget/CompoundButton;
a=0;//     .param p2, "isChecked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v2=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->access$0(Lcom/twocloo/com/cn/activitys/SettingActivity;)Landroid/widget/CheckBox;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->setBrightness(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setMrld(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 146
a=0;//     :goto_0
a=0;//     #v1=(Byte);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity;);
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->access$0(Lcom/twocloo/com/cn/activitys/SettingActivity;)Landroid/widget/CheckBox;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->setBrightness(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity$3;->this$0:Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setMrld(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
