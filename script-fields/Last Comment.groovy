{\rtf1\ansi\ansicpg1252\cocoartf2577
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import com.atlassian.jira.issue.Issue\
import com.atlassian.jira.issue.comments.Comment\
import com.atlassian.jira.issue.comments.CommentManager\
import com.atlassian.jira.component.ComponentAccessor\
\
def commentManager = ComponentAccessor.getCommentManager()\
\
def comment = commentManager.getLastComment (issue)\
\
if (comment)\
	return comment.body+" Author: " + comment.authorFullName+" Created: "+comment.created\
else\
    return "<No comment>"}