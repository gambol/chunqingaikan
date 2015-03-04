package com.twocloo.com.cn.beans.orm; class UserLoginTrace { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;
a=0;// .super Ljava/lang/Object;
a=0;// .source "UserLoginTrace.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/db/orm/TableAble;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
a=0;//     tableName = "user_login_trace"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ID:Ljava/lang/String; = "id"
a=0;// 
a=0;// .field public static final LAST_LOGIN_TIME:Ljava/lang/String; = "last_login_time"
a=0;// 
a=0;// .field public static final LOGIN_TYPE:Ljava/lang/String; = "login_type"
a=0;// 
a=0;// .field public static final USER_ID:Ljava/lang/String; = "user_id"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private id:I
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "id"
a=0;//         generatedId = true
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private lastLoginTime:J
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "last_login_time"
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private loginType:I
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "login_type"
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private userId:I
a=0;//     .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
a=0;//         columnName = "user_id"
a=0;//         useGetSet = true
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->id:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLastLoginTime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-wide v0, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->lastLoginTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getLoginType()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->loginType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getUserId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->userId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setId(I)V
a=0;//     .locals 0
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->id:I
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLastLoginTime(J)V
a=0;//     .locals 0
a=0;//     .param p1, "lastLoginTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iput-wide p1, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->lastLoginTime:J
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLoginType(I)V
a=0;//     .locals 0
a=0;//     .param p1, "loginType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->loginType:I
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUserId(I)V
a=0;//     .locals 0
a=0;//     .param p1, "userId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/beans/orm/UserLoginTrace;->userId:I
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
}}
